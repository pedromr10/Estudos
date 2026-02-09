
package orientacao_objeto.encapsulamento.app;

import java.util.Scanner;


import orientacao_objeto.encapsulamento.entities.Produto;

public class Program {
    public static void main(String[] args){
        //criacao de novos objetos:
        Scanner sc = new Scanner(System.in);
        //Produto pd = new Produto();
        int addQuantity, removeQuantity;

        //recebendo e atribuindo os dados:
        System.out.println("Enter product data:");

        System.out.print("Name: ");
        String nome = sc.next();

        System.out.print("Price: ");
        double preco = sc.nextDouble();

        Produto pd = new Produto(nome, preco);

        //colocando outro nome no produto:
        pd.setName("teste");

        //parte 1 da resposta:
        System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f%n", pd.getName(), pd.getPrice(), pd.getQuantidade(), pd.totalValueInStock());

        //parte 2 da resposta:
        //pegando a quantidade
        System.out.print("Enter the number of products to be added in stock: ");
        addQuantity = sc.nextInt();
        pd.addProducts(addQuantity);
        System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f%n", pd.getName(), pd.getPrice(), pd.getQuantidade(), pd.totalValueInStock());

        //parte 3 da resposta:
        System.out.print("Enter the number of products to be removed in stock: ");
        removeQuantity = sc.nextInt();
        pd.removeProducts(removeQuantity);
        System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f%n", pd.getName(), pd.getPrice(), pd.getQuantidade(), pd.totalValueInStock());     

        //outras funcionalidades:
        System.out.println(pd.toString());
        
        sc.close();
    }
}

/*
obs:
1. é um principio que consiste em esconder detalhes de implementacao de uma classe, expondo apenas operacoes seguras e que mantenham os objetos em um estado consistente

2. o objeto deve sempre estar em um estado consistente, e a propria classe deve garantir isso

3. private = nao pode ser acessado por outras classes

4. caso queira acessar ou alterar esses atributos, necessita-se de metodos, os getters e setters

*/