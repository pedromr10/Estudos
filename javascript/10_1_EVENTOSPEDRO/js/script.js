// 1 - adicionando eventros:
const btn = document.querySelector("#my-button");

btn.addEventListener("click", function(){
    console.log("clicou no botao.");
});

// 2 - removendo evento:
const secondBtn = document.querySelector("#btn");
function imprimirMensagem(){
    console.log("teste");
}
secondBtn.addEventListener("click", imprimirMensagem);

const thirdBtn = document.querySelector("#other-btn");
thirdBtn.addEventListener("click", function(){
    console.log("Evento removido");
    secondBtn.removeEventListener("click", imprimirMensagem);
});

// 3 - argumento do evento:
const myTitle = document.querySelector("#my-title");
myTitle.addEventListener("click", function(event){
    console.log(event);
});

// 4 - propagando evento:
const containerBtn = document.querySelector("#btn-container");
const propagBtn = document.querySelector("#div-btn");

containerBtn.addEventListener("click", function(){
    console.log("evento 1");
});
propagBtn.addEventListener("click", function(e){
    e.stopPropagation();
    console.log("evento 2");
});

// 5 - removendo evento padrao:
const a = document.querySelector("a");
a.addEventListener("click", function(e){
    e.preventDefault();
    console.log("nao alterou a pagina");
});

// 6 - eventos de tecla:
document.addEventListener("keyup", function(e){ //keyup - clica
    console.log(`Foi pressionada a tecla ${e.key}`);
});
document.addEventListener("keydown", function(e){ //keyup - segurar
    console.log(`Foi segurada a tecla ${e.key}`);
});

// 7 - evento de mouse:
const mouse = document.querySelector("#mouse");
mouse.addEventListener("mousedown", function(){
    console.log("pressionou o botao");
});

mouse.addEventListener("mouseup", function(){
    console.log("soltou o botao");
});
mouse.addEventListener("dblclick", function(){
    console.log("duplo clique");
});

// 8 - movimento do mouse:
document.addEventListener("mousemove", function(e){
    //console.log(`Eixo x: ${e.x}`);
    //console.log(`Eixo y: ${e.y}`);
});

// 9 - evento por scroll:
window.addEventListener("scroll", function(e){
    if(window.pageYOffset > 200){
        console.log("passamos de 200 px")
    }
});

// 10 - focus/blur:
const input = document.querySelector("#my-input");

input.addEventListener("focus", function(e){
    console.log("entrou no input");
});
input.addEventListener("blur", function(e){
    console.log("saiu no input");
});

// 11 - eventos de carregamento de pagina:
window.addEventListener("load", function(){
    console.log("a pagina carregou");
});

window.addEventListener("beforeunload", function(e){
    e.preventDefault();
    e.returnValue = "";
});

// 12 - debounce:
