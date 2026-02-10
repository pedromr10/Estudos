package vetor.exe.app;

import java.util.Scanner;

public class ExercicioSomaVetor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for(int i=0;i<n;i++){
            vect[i] = sc.nextDouble();
        }

        //primeira parte da resposta:
        double soma = 0.0;
        for(int i=0;i<vect.length;i++){
            System.out.printf("%.1f ", vect[i]);
            soma+=vect[i];
        }
        //segunda parte da resposta:
        System.out.printf("SOMA: %.2f%n", soma);
        System.out.printf("MEDIA: %.2f%n", soma/n);
    }
}
