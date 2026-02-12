package matriz.exe;

import java.util.Scanner;

public class ExercicioMatriz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int linha = sc.nextInt();
        int coluna = sc.nextInt();

        //adquirindo os valores de dentro da matriz:
        int[][] matriz = new int[linha][coluna];
        for(int i = 0;i<linha;i++){
            for(int j = 0;j<coluna;j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        //recebendo o numero a ser procurado:
        int num = sc.nextInt();

        //procurando os valores:
        for(int i = 0;i<linha;i++){
            for(int j = 0;j<coluna;j++){
                if(matriz[i][j] == num){
                    System.out.printf("Position: %d, %d:%n", i,j);
					if (j > 0) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
					if (j < matriz[i].length-1) {
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if (i < matriz.length-1) {
						System.out.println("Down: " + matriz[i+1][j]);
					}
                }
            }
        }

    }
}
