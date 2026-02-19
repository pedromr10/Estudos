package estrutura_repetitiva.exe;

import java.util.Scanner;

public class ExercicioGasolina {
    public static void main(String[] args){
        int num, alcool = 0, gasolina = 0, diesel = 0;
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        while(num!=4){
            if(num > 4){
                System.out.println("Numero nao esta no range");
            }
            else if(num == 1){
                alcool++;
            }
            else if(num == 2){
                gasolina++;
            }
            else if(num == 3){
                diesel++;
            }
            num = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d%n", alcool);
        System.out.printf("Gasolina: %d%n", gasolina);
        System.out.printf("Diesel: %d%n", diesel);

    }
}
