import GenericFormHandler from "./FormHandler.class.js";
import { apiClient } from "./main.js";
import TableHandler from "./TableHandler.class.js";

const handler = new GenericFormHandler("pessoaFisica", apiClient, "#form-pessoaFisica");
handler.init();

const tableHandler = new TableHandler("pessoaFisica", apiClient, "#table-pessoaFisica", ["id", "nome", "cpf"]);
tableHandler.init();