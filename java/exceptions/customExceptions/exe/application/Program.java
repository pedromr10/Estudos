package exceptions.customExceptions.exe.application;

import java.util.Scanner;

import exceptions.customExceptions.exe.model.entities.Account;
import exceptions.customExceptions.exe.model.exceptions.BusinessException;

public class Program {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe os dados da conta");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Titular: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Saldo inicial: ");
		double balance = sc.nextDouble();
		System.out.print("Limite de saque: ");
		double withdrawLimit = sc.nextDouble();

		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.print("Informe uma quantia para sacar: ");
		double amount = sc.nextDouble();

        try{
            acc.withdraw(amount);
            System.out.printf("Novo saldo: %.2f%n", acc.getBalance());
        }
        catch(BusinessException e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}

/*
Fazer um programa para ler os dados de uma conta bancaria e depois realizar um saque nesta conta, mostrando o novo saldo. Um saque nao pode ocorrer se nao houver saldo na conta ou se o valor do saque for superior ao limite de saque da conta
*/