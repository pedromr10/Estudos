package interface_.semInterface.model.entities;

public class Vehicle {
    private String moodel;

    public Vehicle(){}
    
    public Vehicle(String model){
        this.moodel = model;
    }

    public String getMoodel() {
        return moodel;
    }
    public void setMoodel(String moodel) {
        this.moodel = moodel;
    }
}
