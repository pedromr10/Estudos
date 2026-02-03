package orientacao_objeto.app;

import java.util.Scanner;
import orientacao_objeto.entities.Produto;;

public class ProgramaEstoque {
    public static void main(String[] args){
        //criacao de novos objetos:
        Scanner sc = new Scanner(System.in);
        Produto pd = new Produto();
        int addQuantity, removeQuantity;

        //recebendo e atribuindo os dados:
        System.out.println("Enter product data:");

        System.out.print("Name: ");
        pd.nome = sc.next();
        System.out.print("Price: ");
        pd.preco = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        pd.quantidade = sc.nextInt();

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



        sc.close();
    }
}
