//1 - arrays

const lista = [1, 2,3, 4, 5];

console.log(lista);

// 2- propriedades do array

const numbers = [1, 2, 3];

console.log(numbers.length);

console.log(numbers[1]);

const allNumbers = lista.concat(numbers); //junta as duas listas
console.log(allNumbers);

// - objetos:

const pessoa = {
    name: "pedro",
    idade: 22,
    mulher: "alessandra"
};

console.log(pessoa);
console.log(pessoa.name);
console.log(pessoa.name.length);

// criando e deletando propriedades do objeto:

const pc = {
    cpu: "amd",
    gpu: "nvidia",
    ram: 16
};

console.log(pc);

pc.storage = 512;

console.log(pc);

delete pc.storage;

console.log(pc);

console.log(Object.keys(pc));

const usuarios = ["pedro", "alessandra", "rogerin"];

for(let i = 0;i<usuarios.length; i++){
    console.log(usuarios[i]);
}

usuarios.push("romulo");
console.log(usuarios);
usuarios.pop();
console.log(usuarios);
usuarios.shift();
console.log(usuarios);
usuarios.unshift("joaquim");
console.log(usuarios);