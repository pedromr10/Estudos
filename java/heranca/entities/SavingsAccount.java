//classe criada para entender o upcasting e downcasting

package heranca.entities;

public class SavingsAccount extends Account{
    private Double interestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate){
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance+= balance * interestRate;
    }

    //sobrescrita:
    @Override
    public void withdraw(Double amount){
        balance-=amount;
    }
}
