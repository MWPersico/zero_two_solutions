export default class TableHandler {
    constructor(entityName, apiClient, tableSelector, fields) {
      this.entityName = entityName;
      this.apiClient = apiClient;
      this.fields = fields;
      this.table = document.querySelector(tableSelector);
    }
  
    init() {
      this.carregarEntidade();
    }
  
    async carregarEntidade() {
      try {
        const data = await this.apiClient.get(this.entityName);
        this.gerarTabela(data);
      } catch (error) {
        console.error(`Erro ao carregar ${this.entityName}:`, error);
      }
    }
  
    gerarTabela(data) {
      if (!data || data.length === 0) {
        this.table.innerHTML = "<p>Não há dados para exibir.</p>";
        return;
      }
  
      const headers = Object.keys(data[0]).filter(x=>this.fields.includes(x));
      const thead = document.createElement('thead');
      const headerRow = document.createElement('tr');
  
      headers.forEach(header => {
        const th = document.createElement('th');
        th.textContent = header;
        headerRow.appendChild(th);
      });
  
      const thEditar = document.createElement('th');
      thEditar.textContent = "Ações";
      headerRow.appendChild(thEditar);
  
      thead.appendChild(headerRow);
      this.table.appendChild(thead);
  
      const tbody = document.createElement('tbody');
  
      data.forEach(item => {
        const row = document.createElement('tr');
  
        headers.forEach(header => {
          const td = document.createElement('td');
          td.textContent = item[header];
          row.appendChild(td);
        });
  
        const tdEditar = document.createElement('td');
        const editarLink = document.createElement('a');
        editarLink.href = `?id=${item.id}`;
        editarLink.textContent = "Editar";
        tdEditar.appendChild(editarLink);
        row.appendChild(tdEditar);
  
        tbody.appendChild(row);
      });
  
      this.table.appendChild(tbody);
    }
}