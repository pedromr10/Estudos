package orientacao_objeto.entities;

public class Aluno{
    public String name;
    public double g1, g2, g3;
    public boolean hasPassed;

    public double finalGrade(){
        return g1+g2+g3;
    }

    public boolean isApproved(){
        if(finalGrade() >= 60.0){
            return true;
        }
        else{
            return false;
        }
    }
}