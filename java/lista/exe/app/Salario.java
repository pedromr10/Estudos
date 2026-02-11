package lista.exe.app;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import lista.exe.entities.Funcionario;

public class Salario {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Funcionario> list = new ArrayList<>();
        
        System.out.print("How many employees will be registered? ");
        int n  = sc.nextInt();

        for(int i = 0;i<n;i++){
            System.out.printf("Employee #%d:%n", i+1);
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.println();
            System.out.print("Name: ");
            sc.nextLine(); //so pra n dar problema;
            String name = sc.nextLine();
            System.out.println();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Funcionario func = new Funcionario(id, name, salary);
            list.add(func);
        }
        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int idIncrease = sc.nextInt();
        Integer pos = position(list, idIncrease); //esse pos aponta para um objeto funcionario dentro da lista list
        if( pos == -1){
            System.out.println("This id does not exist!");
        }
        else{
            System.out.println();
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            list.get(pos).increaseSalary(percentage);
        }

        System.out.println("List of employees:");
        for(Funcionario func : list){
            System.out.printf("%d, %s, %.2f%n", func.getId(), func.getName(), func.getSalary());
        }

        sc.close();
    }

    public static int position(List<Funcionario> list, int idIncrease){
        for(int i = 0;i<list.size();i++){
            if(list.get(i).getId() == idIncrease){
                return i;
            }
        }
        return -1;
    }

}

//usar get nos arraylists