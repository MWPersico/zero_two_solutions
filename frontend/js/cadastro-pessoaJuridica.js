import GenericFormHandler from "./FormHandler.class.js";
import { apiClient } from "./main.js";
import TableHandler from "./TableHandler.class.js";

const handler = new GenericFormHandler("pessoaJuridica", apiClient, "#form-pessoaJuridica");
handler.init();

const tableHandler = new TableHandler("pessoaJuridica", apiClient, "#table-pessoaJuridica", ["id", "nome", "cnpj"]);
tableHandler.init();