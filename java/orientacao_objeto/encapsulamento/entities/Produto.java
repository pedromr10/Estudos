package orientacao_objeto.encapsulamento.entities;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome; 
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String nome, double preco){
        this.nome = nome; 
        this.preco = preco;
    }

    //funcao para setar o nome
    public void setName(String nome){
        this.nome = nome; //nome do objeto vira o nome dado pelo usuario (a string no parametro da funcao)
    }

    //funcao para retornar o nome:
    public String getName(){
        return nome;
    }

    //funcao para retornar o preco:
    public double getPrice(){
        return preco;
    }

    //funcao para retornar a quantidade:
    public int getQuantidade(){
        return quantidade;
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

