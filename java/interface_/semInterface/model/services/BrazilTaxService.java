package interface_.semInterface.model.services;

import interface_.semInterface.model.interfaces.TaxService;

public class BrazilTaxService implements TaxService{ //note o implements
    public double tax(double amount){
        if(amount <= 100.00){
            return amount*0.20;
        }
        else{
            return amount*0.15;
        }
    }
}
