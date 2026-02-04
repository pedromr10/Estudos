package orientacao_objeto.app;

import java.util.Scanner;
import orientacao_objeto.entities.Funcionario;

public class ProgramaSalario {
    public static void main(String[] args){
        //instanciando scanner, funcionario e percentage:
        Scanner sc = new Scanner(System.in);
        Funcionario func = new Funcionario();
        int percentage;

        //recebendo os dados:
        System.out.print("Name: ");
        func.name = sc.nextLine();
        System.out.print("Gross salary: ");
        func.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        func.tax = sc.nextDouble();

        //primeira parte da resposta:
        System.out.printf("Employee: %s, $ %.2f%n", func.name, func.netSalary());

        //capturando a porcentagem:
        System.out.print("Which percentage to increase salary?: ");
        percentage = sc.nextInt();
        //fazendo o aumento:
        func.increaseSalary(percentage);

        //segunda parte da resposta:
        System.out.printf("Updated data: %s, $ %.2f%n", func.name, func.netSalary());
    }
}
