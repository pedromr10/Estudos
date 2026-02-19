package polimorfismo.exe.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import polimorfismo.exe.entities.Employee;
import polimorfismo.exe.entities.OutsourcedEmployee;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            System.out.printf("Employee #%d data:%n", i+1);

            

            //terceirizado?
            System.out.print("Outsourced (y/n)? ");
            char c = sc.next().charAt(0); 
            //nome:
            sc.nextLine(); //tirar o enter
            System.out.print("Name: ");
            String name = sc.nextLine();
            //horas:
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            sc.nextLine(); //tirar o enter do int
            //valor por hora:
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            //caso seja terceirizado:
            if(c == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                list.add(emp);
            }
            else{
                Employee emp = new Employee(name, hours, valuePerHour);
                list.add(emp);
            }
        }
        System.out.println();
        System.out.println("PAYMENTS:");

        for(Employee emp : list){
            System.out.println(emp.getName() + " - $ " + emp.payment());
        }
        sc.close();
    }
}
