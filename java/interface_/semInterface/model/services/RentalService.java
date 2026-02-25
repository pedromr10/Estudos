package interface_.semInterface.model.services;

import java.time.Duration;

import interface_.semInterface.model.entities.CarRental;
import interface_.semInterface.model.entities.Invoice;
import interface_.semInterface.model.interfaces.TaxService;

public class RentalService {
    private Double pricePerDay;
    private Double pricePerHour;

    //nao é uma boa pratica fazer a instancia desse braziltaxservice, pois da uma dependencia direta da classe rentalservice para com braziltaxservice:
    //fora que se precisar fazer uma manutencao (ter outro tipo de imposto, usa por exemplo), teria de alterar em varios arquivos
    //private BrazilTaxService taxService;
    private TaxService taxService;

    public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService){
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes/60.0;

        double basicPayment;
        if(hours <= 12.0){
            basicPayment = pricePerHour * Math.ceil(hours);
        }
        else{
            basicPayment = pricePerDay *Math.ceil(hours/24.0);
        }

        double tax = taxService.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
