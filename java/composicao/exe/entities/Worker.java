package composicao.exe.entities;

import composicao.exe.enums.WorkerLevel;
import composicao.exe.entities.HourContract;;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    public Worker(String name, WorkerLevel level, Double baseSalary){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
    }

    public void addContract(HourContract contract){
        
    }

    public void removeContract(HourContract contract){

    }

    public Double income(Integer year, Integer month){
        return 0.0;
    }

    public String toString(){
        return name + level + baseSalary;
    }
}
