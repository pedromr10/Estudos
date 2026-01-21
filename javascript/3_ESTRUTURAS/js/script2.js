// 1 - variaveis:

let nome = "pedro";
console.log(nome);
nome = "joao";
console.log(`meu nome é ${nome}`);

/*
// 2 - capturando infos do usuario:
const age = prompt("Digite sua idade: ");
console.log(`voce tem ${age} anos?`);22

// 3 - funcao alert:
alert("testando alert");

*/
// funcoes do obj math:
console.log(Math.max(5, 3, 3, 4.4, 10.1));
    //arredonda pra baixo:
console.log(Math.floor(4.9));
    //arredonda pra cima:
console.log(Math.ceil(5.2));

// funcoes do obj console:
console.log("testando a funcionalidade log");
    //erro - dispara erro:
console.error("erro!");
    //aviso:
console.warn("aviso");


//estruturas de controle:
const m = 3;

if(m === 1){
    console.warn("é igual a 1");
}
else if(m === 2){
    console.warn("é igual a 2");
}
else{
    console.warn("nao é igual a 1");
}

// estruturas de repeticao:
let x = 0;
while(x <10){
    console.log(`valor de x é ${x}`);
    x += 1;
}

for(let y = 0;y<10;y++){
    console.log(`valor de y é ${y}`)
    if(y === 3){
        continue;
    }
}