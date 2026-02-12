package matriz;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //pra demonstrar que é um arranjo bidimensional, utiliza-se dois []
        int [][] mat = new int[n][n]; //[linhas][colunas]

        for(int i=0;i<n;i++){
            for(int j = 0;j<n;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        int negative = 0;
        System.out.println("Main diagonal:");
        for(int i=0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(mat[i][j]<0){
                    negative++;
                }
                if(i == j){
                    System.out.println(mat[i][j]);
                }
            }
        }

        System.out.println("Negative numbers: " + negative);
        sc.close();
    }
}
