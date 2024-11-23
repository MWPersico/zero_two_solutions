export default class GenericFormHandler {
    constructor(entityName, apiClient, formSelector) {
      this.entityName = entityName;
      this.apiClient = apiClient;
      this.form = document.querySelector(formSelector);
      this.id = new URLSearchParams(window.location.search).get("id");
      this.onInit = async () => {};
    }
  
    async init() {
      await this.onInit();
      if (this.id) {
        this.carregarEntidade();
      }
      this.form.addEventListener("submit", (e) => this.salvarEntidade(e));
      this.setupDeleteButton();
    }
  
    async carregarEntidade() {
      const data = await this.apiClient.get(`${this.entityName}/${this.id}`);
      this.popularForm(data);
    }
  
    popularForm(data) {
      Object.entries(data).forEach(([key, value]) => {
        const input = this.form.querySelector(`[name="${key}"]`);
        if (input) {
          if (input.type === "checkbox") {
            input.checked = value;
          } else if (input.type === "date") {
            input.value = value ? new Date(value).toISOString().split("T")[0] : "";
          } else if(input.tagName == "SELECT"){
            input.value = value.id ?? value;
          } else {
            input.value = value;
          }
        }
      });
    }

    popularDropdown(dropdownId, options, value, text, selectedValue = null) {
      const dropdown = document.getElementById(dropdownId);
      if (!dropdown) return;
  
      options.forEach(option => {
          const optionElement = document.createElement("option");
          optionElement.value = option[value];
          optionElement.textContent = option[text];
          dropdown.appendChild(optionElement);
      });


      if (selectedValue) {
        dropdown.value = selectedValue;
      }
    }
  
    async salvarEntidade(event) {
      event.preventDefault();
      const data = this.transformarDados(this.form);

      if (this.id) {
        await this.apiClient.put(`${this.entityName}/${this.id}`, data);
        alert(`${this.entityName} atualizado com sucesso!`);
      } else {
        const created = await this.apiClient.post(this.entityName, data);
        alert(`${this.entityName} cadastrado com sucesso!`);

        window.location.href += `${created.id ? "?id="+created.id : ""}`;
      }
    }
  
    setupDeleteButton() {
      const deleteButton = document.querySelector("#delete-btn");
      if (this.id && deleteButton) {
        deleteButton.style.display = "block";
        deleteButton.addEventListener("click", async event => {
            event.preventDefault();
          if (confirm(`Deseja realmente deletar ${this.entityName}?`)) {
            await this.apiClient.delete(`${this.entityName}/${this.id}`);
            alert(`${this.entityName} deletado com sucesso!`);

            const url = new URL(window.location.href);
            url.searchParams.delete("id");
            window.location.href = url.toString();
          }
        });
      }
    }

    transformarDados(form) {
      const data = Object.fromEntries(new FormData(form));
      const camposDropdown = ["curso"];

      camposDropdown.forEach(field => {
          const select = form.querySelector(`select[name="${field}"]`);
          if (select && select.value) {
              data[field] = { id: parseInt(select.value) };
          }
      });
      return data;
    }
}
  