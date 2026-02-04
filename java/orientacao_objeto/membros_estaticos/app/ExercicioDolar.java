package orientacao_objeto.membros_estaticos.app;

import java.util.Scanner;
import orientacao_objeto.membros_estaticos.util.CurrencyConverter;

public class ExercicioDolar {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price: ");
        double dolarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought: ");
        double amount = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.converter(dolarPrice, amount));

    }
}
