package vetor.app;

import java.util.Scanner;
import vetor.entities.Product;

public class Program2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //criando um vetor de objeto
        Product[] vect = new Product[n];

        //pegando os dados:
        for(int i = 0;i<n;i++){
            sc.nextLine(); //so pra tirar a quebra de linha depois de pegar o int
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price); //é um vetor de objetos
        }

        //fazendo a media do preco:
        double soma = 0.0;
        for(int i = 0;i<n;i++){
            soma+= vect[i].getPrice();
        }
        double avg = soma/n;
        System.out.println("media de preco: " + avg);

        //funcao interessante para saber tamanho do vetor:
        System.out.println(vect.length);

        sc.close();
    }
}
