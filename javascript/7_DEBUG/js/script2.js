//1 - strict:
"use strict"

// debugger:

let c = 1;
let d = 2;
if(c==1){
    c = d+ 2;
}
debugger;
for(let i = 0;i<d;i++){
    c = c + 2;
}
console.log("Executou o loop");

debugger;

if(c>5){
    c = 25;
}

// exceptions:
let x = 10;

if(x != 11){
    //throw new Error("O valor de x nao pode ser diferente de 11!");
}

// try catch:
try{
    const soma = x + y;
} catch(error){
    console.log(`Erro no programa: ${error}` );
}