package orientacao_objeto.sobrecarga.app;

import java.util.Scanner;
import orientacao_objeto.sobrecarga.entities.Produto;

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

        //System.out.print("Quantity in stock: ");
        //int quantidade = sc.nextInt();

        Produto pd = new Produto(nome, preco);

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
        System.out.println(pd.toString());
        
        sc.close();
    }
}

/*obs:

1. Sobrecarga é um recurso que uma classe possui de oferecer mais de uma operação com o mesmo nome, porém com diferentes listas de parâmetros.
2. "a diferenca entre elas é a quantidade de parametros"
*/