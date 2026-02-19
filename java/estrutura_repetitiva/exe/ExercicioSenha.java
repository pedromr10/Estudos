package estrutura_repetitiva.exe;

import java.util.Scanner;

public class ExercicioSenha {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        while(num != 2002){
            System.out.println("Senha invalida");
            num = sc.nextInt();
        }
        System.out.println("Acesso permitido");
        sc.close();
    }
}
