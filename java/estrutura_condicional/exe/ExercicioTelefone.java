package estrutura_condicional.exe;
import java.util.Scanner;

public class ExercicioTelefone {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double valor = 50.00;
        if(num<100){
            System.out.printf("Valor a pagar: R$ %.2f", valor);
        }
        else{
            num = (num-100)*2;
            valor+=num;
            System.out.printf("Valor a pagar: R$ %.2f", valor);
        }
    }
}
