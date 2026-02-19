package heranca.entities;


public class BusinessAccount extends Account{ //note o extends
    private Double loanLimit;

    public BusinessAccount(){
        super(); //medida preventiva caso tenha alguma logica no construtor vazio da superclasse, nesse caso a superclasse é o account
    }
    
    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit){
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }
    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount){
        if(amount<=loanLimit){
            balance+= amount - 10.0;
        }
        
    }
    
}
