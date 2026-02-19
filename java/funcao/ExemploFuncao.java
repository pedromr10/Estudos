package funcao;

import java.util.Scanner;

public class ExemploFuncao {
    public static void main(String[] args){
        //fazer um programa pra ler tres numeros inteiros e mostrar o maior deles

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a,b,c);

        showResult(higher);

        sc.close();
    }

    public static int max(int x, int y, int z){
        int aux;
        if(x>y && x>z){
            aux = x;
        }
        else if(y>z){
            aux = y;
        }
        else{
            aux = z;
        }
        return aux;
    }

    public static void showResult(int value){
        System.out.println(value + " eh o maior numero");
    }
}
