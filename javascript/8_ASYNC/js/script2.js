// setTiemout

console.log("ainda nao executgou");

setTimeout(function() {
    console.log("requisicao assincrona");
}, 2000);

console.log("ainda nao executou 2");

// setInterval - funcao nao para de ser executada:
console.log("ainda nao comecou");

/*
setInterval(function() {
    console.log("mensagem com intervalo");
}, 2000);
*/

console.log("ainda nao comecou 2");

// promises: - executa após todo codigo sincrono 
const promessa = Promise.resolve(5+5);

console.log("algum codigo");

promessa.then((value) =>{
    console.log(`A soma é ${value}`);
});

console.log("algum codigo 2");

// funcoes async:

async function somarComDelay(a, b) {
    return a+b;
}

somarComDelay(2, 4).then((value) => {
    console.log(`o valor da soma é: ${value}`);
});

// await:
