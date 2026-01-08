// 1 - instalacao do axios:
console.log(axios);

// 2 - primeiro request:
const getData = async() => {
    try {
        const response = await axios.get("https://jsonplaceholder.typicode.com/users");

        console.log(response);
        
        return response.data;
    } catch (error) {
        console.log(error);
    }
}
//pegando a resposta a partir do return, como é async, nao da pra pegar simplesmente o resultado, tem q ser numa funcao async:
const receiveData = async() =>{
    const data = await getData();
    console.log(data);
}
//getData();
receiveData();

// 2.1 - pegando erro:
//obs: response so existe se o servidor respondeu;
const getError = async() =>{
    try {
        const resp = await axios.get("https://jsonplaceholder.typicode.com/userss"); //erro proposital
        return response.data;
        
    } catch (error) {
        console.log(error); //usei isso apenas para ver quais os tipos de elementos dentro do objeto error (message, status, etc...)
        if(error.response){
            return `Erro: ${error.message}`;
        }
    }
}
//chamando a funcao, de forma assincrona tambem:
const receiveError = async() =>{
    const error = await getError();
    console.log(error);
}
receiveError();

// 3 - imprimindo dados na tela:
const container = document.querySelector("#user-container");
const printData = async() => {
    const data = await getData();
    console.log(data);
    data.forEach((user) =>{ //cada usuario capturado em data, tera como nome de variavel "user"
        const userDiv = document.createElement("div");
        const nameElement = document.createElement("h2");
        nameElement.textContent = user.name;

        const emailElement = document.createElement("p");
        emailElement.textContent = user.email;

        userDiv.appendChild(nameElement);
        userDiv.appendChild(emailElement);
        container.appendChild(userDiv);
    });
}
printData();

// 4 - definindo headers:
const getData2 = async() => {
    try {
        const response = await axios.get("https://jsonplaceholder.typicode.com/users", {
            headers:{
                "Content-Type": "application/json",
                custom: "header"
            }
        }
    );

        console.log(response);
        
        return response.data;
    } catch (error) {
        console.log(error);
    }
}

const receiveData2 = async() =>{
    const data = await getData2();
    console.log(data);
}
receiveData2();

// 5 - requisicao de post:
const form = document.querySelector("#post-form");
const titleInput = document.querySelector("#title");
const bodyInput = document.querySelector("#body");

form.addEventListener("submit",(e)=>{
    e.preventDefault(); //permite que a pagina nao recarregue ao usuario apertar o botao, o que seria um comportamento comum.
    axios.post("https://jsonplaceholder.typicode.com/posts",{
            title: titleInput.value,
            body: bodyInput.value,
            userId: 1
    });
});
