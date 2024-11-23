import GenericFormHandler from "./FormHandler.class.js";
import { apiClient } from "./main.js";

const handler = new GenericFormHandler("pessoaFisica", apiClient, "#form-pessoaFisica");
handler.init();