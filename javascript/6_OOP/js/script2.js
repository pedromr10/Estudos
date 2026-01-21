const animal = {
    nome: "cachorro",
    latir: function (){
        console.log("au au");
    }
};

animal.latir();

// - aprofundando metodos:

const pessoa = {
    nome: "pedro",
    getNome: function(){
        return this.nome;
    },
    setNome: function(novoNome){
        this.nome = novoNome;
    }
}
console.log(pessoa.getNome());
pessoa.setNome("alessandra");
console.log(pessoa.getNome());

const cachorro = {
    raca: null
};

const pastorAlemao = Object.create(cachorro);
pastorAlemao.raca = "Pastor alemao";
console.log(pastorAlemao.raca);

function addDog(nome, raca){
    const newDog = Object.create({});
    newDog.raca = raca;
    newDog.nome = nome;

    return cachorro;
};

function Cachorro(nome, raca){
    this.nome = nome;
    this.raca = raca;
}

const husky = new Cachorro("joca", "Husky siberiano");
console.log(husky);
// - metodos na funcao construtora:
Cachorro.prototype.uivar = function(){
    console.log("Auuu!");
}

husky.uivar();

// 9 - classes:
class Gato{
    constructor(nome, cor){
        this.nome = nome;
        this.cor = cor;
    }
}

const jiji = new Gato("Jiji", "Preto");
const yuki = new Gato("Yuki", "Mesclado");

// 10 - mais treino de classe:

class Caminhao{
    constructor(eixos, cor){
        this.eixos = eixos;
        this.cor = cor;
    }

    descrever(){
        console.log(`O caminhao tem ${this.eixos} eixos e tem a cor ${this.cor}`);
    }
}

const c1 = new Caminhao(6, "Roxo");

c1.descrever();

// heranca:
class Mamifero{
    constructor(patas){
        this.patas = patas;
    }
}

class Lobo extends Mamifero{
    constructor(patas, nome){
        this.nome = nome;
        super(patas, patas);
    }
}

const iji = Lobo(4, "Iji");