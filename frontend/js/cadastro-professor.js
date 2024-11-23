import GenericFormHandler from "./FormHandler.class.js";
import { apiClient } from "./main.js";
import TableHandler from "./TableHandler.class.js";

const handler = new GenericFormHandler("professor", apiClient, "#form-professor");
handler.init();

const tableHandler = new TableHandler("professor", apiClient, "#table-professor", ["id", "nome", "cpf"]);
tableHandler.init();