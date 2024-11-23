import GenericFormHandler from "./FormHandler.class.js";
import { apiClient } from "./main.js";
import TableHandler from "./TableHandler.class.js";

const handler = new GenericFormHandler("fornecedor", apiClient, "#form-fornecedor");
handler.init();

const tableHandler = new TableHandler("fornecedor", apiClient, "#table-fornecedor", ["id", "nome", "cnpj"]);
tableHandler.init();