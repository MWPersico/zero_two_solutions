import GenericFormHandler from "./FormHandler.class.js";
import { apiClient } from "./main.js";

const handler = new GenericFormHandler("aluno", apiClient, "#form-aluno");

handler.onInit = async () => {
    const cursos = await apiClient.get("curso");
    handler.popularDropdown("curso", cursos, "id", "descricao")
};

handler.init();