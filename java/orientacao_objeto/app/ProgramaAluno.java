package orientacao_objeto.app;

import orientacao_objeto.entities.Aluno;
import java.util.Scanner;

public class ProgramaAluno {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();

        a.name = sc.nextLine();
        a.g1 = sc.nextDouble();
        a.g2 = sc.nextDouble();
        a.g3 = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n", a.finalGrade());

        if(a.isApproved() == true){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", 60.0-a.finalGrade());
        }

        sc.close();
    }
}
