export default class HttpClient {

    constructor(baseUrl){
        this.baseUrl = baseUrl
    }

    async request(method, url, data = null) {
        const options = {
            method,
            headers: {
                'Content-Type': 'application/json',
            },
        };

        if (data) {
            options.body = JSON.stringify(data);
        }

        const response = await fetch(`${this.baseUrl}${url}`, options);

        if (!response.ok) {
            throw new Error(`HTTP error! Status: ${response.status}`);
        }

        if (response.status !== 204) {
            return await response.json();
        }
        return null;
    }

    get(url) {
        return this.request('GET', url);
    }

    post(url, data) {
        return this.request('POST', url, data);
    }

    put(url, data) {
        return this.request('PUT', url, data);
    }

    delete(url) {
        return this.request('DELETE', url);
    }
}