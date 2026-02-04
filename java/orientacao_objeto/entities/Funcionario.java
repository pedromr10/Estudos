package orientacao_objeto.entities;

public class Funcionario {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary-tax;
    }

    public void increaseSalary(double percentage){
        percentage = percentage/100;
        grossSalary = grossSalary + (grossSalary*percentage);
    }
}
