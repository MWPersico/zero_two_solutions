import GenericFormHandler from "./FormHandler.class.js";
import { apiClient } from "./main.js";

const handler = new GenericFormHandler("pessoaJuridica", apiClient, "#form-pessoaJuridica");
handler.init();