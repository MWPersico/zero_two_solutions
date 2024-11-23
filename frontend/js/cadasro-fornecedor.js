import GenericFormHandler from "./FormHandler.class.js";
import { apiClient } from "./main.js";

const handler = new GenericFormHandler("fornecedor", apiClient, "#form-fornecedor");
handler.init();