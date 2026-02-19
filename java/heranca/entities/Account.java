package heranca.entities;

public class Account {
    //private so é acessado pela própria classe
    private Integer number;
    private String holder;
    //protected nao fica publico e pode ser acessado pelas suas subclasses
    protected Double balance; 

    public Account(){} //tenho que pegar a mania de fazer o construtor vazio

    public Account(Integer number, String holder, Double balance){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }
    public Double getBalance() {
        return balance;
    }

    public void withdraw(Double amount){
        balance-=amount;
    }

    public void deposit(Double amount){
        balance+=amount;
    }

}
