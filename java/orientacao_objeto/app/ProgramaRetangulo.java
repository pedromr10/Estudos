package orientacao_objeto.app;

import java.util.Scanner;
import orientacao_objeto.entities.Retangulo;;

public class ProgramaRetangulo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Retangulo ret = new Retangulo();

        System.out.println("Enter rectangle width and height:");
        ret.width = sc.nextDouble();
        ret.height = sc.nextDouble();
        
        System.out.printf("AREA = %.2f%n", ret.area());
        System.out.printf("PERIMETER = %.2f%n", ret.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", ret.diagonal());

        sc.close();
    }
}
