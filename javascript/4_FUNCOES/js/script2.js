// 1 - crinando uma funcao
function primeiraFuncao(){
    console.log("testando");
}

primeiraFuncao();

//funcao com parametro:
function imprimirAlgo(algo){
    console.log(`Imprimindo: ${algo}`);
}

imprimirAlgo("penis");

//funcao com retorno:

function funcaoComRetorno(n1, n2){
    return n1+n2;
}

const soma = funcaoComRetorno(3, 4);
console.log(soma);
console.log(funcaoComRetorno(6, 6));

//arrow function - é uma funcao anonima, entao rpecisa estar dentro de uma variavel:

const penis = () =>{
    console.log("funcao arrow");
};

penis();

const parOuImpar = (n)=>{
    if(n%2 == 0){
        console.log("é par");
    }
    else{
        console.log("é impar");
    }
}

parOuImpar(2);

parOuImpar(3);

//argumentos opcionais:
