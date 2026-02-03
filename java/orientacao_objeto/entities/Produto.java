package orientacao_objeto.entities;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public double totalValueInStock(){
        return preco*quantidade;
    }

    public void addProducts(int addQtd){
        quantidade+=addQtd;
    }

    public void removeProducts(int remQtd){
        quantidade-=remQtd;
    }
}
