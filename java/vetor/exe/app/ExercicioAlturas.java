package vetor.exe.app;

import java.util.Scanner;
import vetor.exe.entities.PessoaAltura;

public class ExercicioAlturas{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas pessoas serao digitadas: ");
        int n = sc.nextInt();
        PessoaAltura[] vect = new PessoaAltura[n];

        for(int i = 0;i<n;i++){
            sc.nextLine(); //pra n dar problema
            System.out.printf("Dados da %da pessoa:%n", i);
            String nome = sc.nextLine();
            int idade = sc.nextInt();
            double altura = sc.nextDouble();
            vect[i] = new PessoaAltura(nome, idade, altura);
        }

        //primeira parte da resposta:
        System.out.printf("Altura media: %.2f%n", PessoaAltura.avgAltura(vect));

        //segunda parte da resposta:
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%%n", PessoaAltura.menos16anos(vect));
    }
}