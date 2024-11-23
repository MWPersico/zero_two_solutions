import GenericFormHandler from "./FormHandler.class.js";
import { apiClient } from "./main.js";

const handler = new GenericFormHandler("professor", apiClient, "#form-professor");
handler.init();