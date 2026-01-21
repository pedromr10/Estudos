// 1 - movendo-se pelo dom
console.log(document.body);

console.log(document.body.childNodes);

console.log(document.body.childNodes[1].childNodes);

//2 - selecionando por tag:
const listItens = document.getElementsByTagName("li"); //-ve propriedades e metodos dos elementos selecionados.

console.log(listItens);

// 3 - selecionando por id:
const title = document.getElementById("title");
console.log(title);

// 4 - selecionando por classe:

const produtos = document.getElementsByClassName("product");
console.log(produtos);

// 5 - selecionando os elementos por css:

const productQuery = document.querySelectorAll(".product");

console.log(productQuery);

// 6 - insertbefore:
//cria um elemento antes de outro elemento

const p = document.createElement("p"); //cria um elemento de paragrafo.

const header = title.parentElement; //pega o elemento pai do titulo (header)

header.insertBefore(p, title); //vai ter um paragrafo antes do titulo.

// 7 - appendchild
const navLinks = document.querySelector("nav ul");
//pega o primeiro elemento

const li = document.createElement("li");

navLinks.appendChild(li);

// 8 - replacechild 
// vai trocar o title por outro elemento:

const h2 = document.createElement("h2");
h2.textContent = "meu novo titulo";

header.replaceChild(h2, title);

//9 - createtextnode
const myText = document.createTextNode("agora vamos colocar mais um titulo");

const h3 = document.createElement("h3");
h3.appendChild(myText);

header.appendChild(h3);

// 10 - trabalhando com atributos
const firstLink = navLinks.querySelector("a");

console.log(firstLink);

firstLink.setAttribute("href", "https://www.google.com");

//11 - altuira e largura
const footer = document.querySelector("footer");

console.log(footer.offsetHeight);
console.log(footer.offsetWidth);

//12 - getClientboundingrect - posicao do elemento

//13 - editando css com js

h2.style.color = "red";