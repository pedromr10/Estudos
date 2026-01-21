const simpleButton = document.querySelector("#simple-button");

simpleButton.addEventListener("click", function(){
    alert("você clicou no botão simples!");
});

//funcoes:
//funcao normal:
function soma(a, b){
    return a+b;
}
//funcao anonima:
const somaAnonima = function(a,b){
    return a+b;
}
//arrow function:
const somaArrow = (a,b) =>{ //usa o this do contexto, usa o this de onde foi criada
    return a+b;
}