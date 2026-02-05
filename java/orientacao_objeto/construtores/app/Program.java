//package orientacao_objeto.construtores.app; era pra ser o certo, mas o vs code é chato
package app;

import java.util.Scanner;

//import orientacao_objeto.construtores.entities.Produto; era pra ser o certo, mas o vs code é chato
import entities.Produto;

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

        System.out.print("Quantity in stock: ");
        int quantidade = sc.nextInt();

        Produto pd = new Produto(nome, preco, quantidade);

        //parte 1 da resposta:
        System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f%n", pd.nome, pd.preco, pd.quantidade, pd.totalValueInStock());

        //parte 2 da resposta:
        //pegando a quantidade
        System.out.print("Enter the number of products to be added in stock: ");
        addQuantity = sc.nextInt();
        pd.addProducts(addQuantity);
        System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f%n", pd.nome, pd.preco, pd.quantidade, pd.totalValueInStock());

        //parte 3 da resposta:
        System.out.print("Enter the number of products to be removed in stock: ");
        removeQuantity = sc.nextInt();
        pd.removeProducts(removeQuantity);
        System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f%n", pd.nome, pd.preco, pd.quantidade, pd.totalValueInStock());     

        //outras funcionalidades:
        System.out.println(pd.toString()); //se tirar o toString da no mesmo, o java entende que imprimir so o pd seria imprimir o toString
        
        sc.close();
    }
}

/*
OBS:

1. classe = modelo | objeto = instancia que segue esse modelo
2. Quando instanciamos um objeto, ele vem com seus atributos vazios, nesse caso:
name = null, price = 0.0, quantity = 0
3. assim, para isso serve o construtor. nao existe produto sem nome, sem preco, desta maneira, a partir do construtor é possivel fazer com que seja obrigaroria a iniciacao desses valores.
*/