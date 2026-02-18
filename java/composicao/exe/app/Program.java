package composicao.exe.app;

import java.util.Scanner;

import composicao.exe.entities.Department;
import composicao.exe.entities.Worker;
import composicao.exe.enums.WorkerLevel;
import java.time.LocalDate;

public class Program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //pegando departamento:
        System.out.print("Enter department's name: ");
        String deptName = sc.nextLine();
        Department dept = new Department(deptName);
        //printando so pra ver se ta funcionando:
        //System.out.println(dept);
        
        //pegando worker:
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        String level = sc.nextLine();
        WorkerLevel workerLevel = WorkerLevel.valueOf(level.toUpperCase());
        System.out.print("Base salary: ");
        Double baseSalary = sc.nextDouble();
        //criando o worker:
        Worker worker = new Worker(name, workerLevel, baseSalary);
        //printando o worker so pra ver se ta funcionando:
        //System.out.println(worker);

        //contratos:
        System.out.print("How many contracts to this worker: ");
        int qtd = sc.nextInt();
        for(int i = 0;i<qtd;i++){
            System.out.printf("Enter contract #%d data: %n", i+1);
            //pegando a data:
            System.out.println("Date (DD/MM/YYYY): ");
            String data = sc.next();
            LocalDate dataParse = LocalDate.parse(data);
            System.out.println(dataParse);

        }

        sc.close();
    }
}
