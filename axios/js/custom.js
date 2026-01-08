//cria uma instância separada do Axios, ou seja, um “Axios próprio”, independente do Axios global:
const postsFetch = axios.create({
    //endereço base que será usado automaticamente em todas as chamadas feitas com essa instância:
    baseURL: "https://jsonplaceholder.typicode.com"
});

//obs: estudar mais essa parte