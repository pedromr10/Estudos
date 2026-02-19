package heranca.app;

import heranca.entities.Account;
import heranca.entities.BusinessAccount;
import heranca.entities.SavingsAccount;

public class Program {
    public static void main(String[] args){
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Gerbelli", 0.0, 500.00);

        //upcasting:
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1001, "Pedro", 0.0, 200.00);
        Account acc3 = new SavingsAccount(1001, "Munhoz", 0.0, 0.01);

        //downcasting: converte um objeto da superclasse para a subclasse
        BusinessAccount acc4 = (BusinessAccount)acc2; //mesmo sendo um businessaccount, é do tipo account, o acc2

        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount)acc3;
            System.out.println("teste");
        }
        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount)acc3;
            System.out.println("teste2");
        }

        
    }
}
