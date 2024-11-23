import GenericFormHandler from "./FormHandler.class.js";
import { apiClient } from "./main.js";
import TableHandler from "./TableHandler.class.js";

const handler = new GenericFormHandler("aluno", apiClient, "#form-aluno");

handler.onInit = async () => {
    const cursos = await apiClient.get("curso");
    handler.popularDropdown("curso", cursos, "id", "descricao")
};

handler.init();

const tableHandler = new TableHandler("aluno", apiClient, "#table-aluno", ["id", "nome", "cpf"]);
tableHandler.init();