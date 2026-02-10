package vetor;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //criando o vetor:
        double[] vect = new double[n];
        // estrutura: tipodovetor[] nomedovetor = new tipodovetor[qtddeelementos]
        for(int i = 0;i<n;i++){
            vect[i] = sc.nextDouble();
        }

        double soma = 0;
        for(int i = 0;i<n;i++){
            soma += vect[i];
        }
        double avg = soma/n;
        System.out.println("Avg height: " + avg);


        sc.close();
    }
}
