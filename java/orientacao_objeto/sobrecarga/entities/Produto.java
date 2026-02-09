package orientacao_objeto.sobrecarga.entities;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public Produto(String nome, double preco, int quantidade){

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    //sobrecarga
    public Produto(String nome, double preco){

        this.nome = nome;
        this.preco = preco;;
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

