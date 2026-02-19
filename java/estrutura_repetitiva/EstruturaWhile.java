package estrutura_repetitiva;

import java.util.Scanner;
public class EstruturaWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while(x!=0){
            x = sc.nextInt();
        }

        sc.close(); 
    }
}
