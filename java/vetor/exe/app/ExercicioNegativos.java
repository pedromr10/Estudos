package vetor.exe.app;

import java.util.Scanner;

public class ExercicioNegativos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");

        int n = sc.nextInt();
        int[] vect = new int[n];

        for(int i = 0;i<n;i++){
            vect[i] = sc.nextInt();
        }

        System.out.println("Numeros negativos:");
        for(int i = 0;i<vect.length;i++){
            if(vect[i] < 0){
                System.out.println(vect[i]);
            }
        }
    }
}
