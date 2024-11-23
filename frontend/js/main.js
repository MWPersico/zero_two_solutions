import HttpClient from "./HttpClient.class.js"

export const API_URL = "http://localhost:8080/api/"

export const apiClient = new HttpClient(API_URL);

function initCheckboxes() {
    const checkboxes = document.querySelectorAll('input[type="checkbox"]');

    checkboxes.forEach((checkbox) => {
        checkbox.value = checkbox.checked;

        checkbox.addEventListener("change", () => {
            checkbox.value = checkbox.checked;
        });
    });
}

initCheckboxes();