//package orientacao_objeto.construtores.entities; era pra ser o certo, mas o vs code é chato

package entities;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    //construtor:
    //os nomes podem ser diferentes (os dentro do parenteses do construtor), mas por convencao se coloca o mesmo dos instanciados acima
    public Produto(String nome, double preco, int quantidade){
        /*se colocar so name = name, o java entende que esta priorizando o criado dentro do metodo construtor, assim, para referenciar o instanciado antes do construtor, utiliza-se o this */
        this.nome = nome; //o nome de fora da funcao (atributo do metodo) = nome de dentro da funcao (o q esta entre parenteses, o parametro)
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double totalValueInStock(){
        return preco*quantidade;
    }

    public void addProducts(int addQtd){
        quantidade+=addQtd;
    }

    public void removeProducts(int remQtd){
        quantidade-=remQtd;
    }

    //outras funcionalidades:
    public String toString(){
        return nome;
    }
}

/*
OBS

1. o this é uma referencia para o proprio objeto
*/