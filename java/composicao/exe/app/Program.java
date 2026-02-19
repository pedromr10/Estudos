package composicao.exe.app;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import composicao.exe.entities.Worker;
import composicao.exe.entities.HourContract;
import composicao.exe.entities.Department;
import composicao.exe.enums.WorkerLevel;
;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //pegando departamento:
        System.out.print("Enter department's name: ");
        String deptName = sc.nextLine();
        Department dept = new Department(deptName);
        
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
        Worker worker = new Worker(name, workerLevel, baseSalary, new Department(deptName));
        //printando o worker so pra ver se ta funcionando:
        //System.out.println(worker);

        //contratos:
        System.out.print("How many contracts to this worker: ");
        int qtd = sc.nextInt();
        for(int i = 0;i<qtd;i++){
            System.out.printf("Enter contract #%d data: %n", i+1);
            //pegando os dados para enviar para o HourContract:
            //pegando a data:
            System.out.println("Date (DD/MM/YYYY): ");

            Date contractDate = sdf.parse(sc.next());
            //printando a data so pra ver se ta funcionando o parse:
            System.out.println(contractDate);

            //pegando o valor por hora:
            System.out.println("Value per hour: ");
            Double valuePerHour = sc.nextDouble();

            //pegando duracao:
            System.out.println("Duration: ");
            Integer duration = sc.nextInt();
            sc.nextLine();

            //enviando para o hourcontract:
            HourContract contract = new HourContract(contractDate, valuePerHour, duration);
            //enviando contract para o worker:
            worker.addContract(contract);
        }
        //resposta:
        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
        sc.close();
    }
}
