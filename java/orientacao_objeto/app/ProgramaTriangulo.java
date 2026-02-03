package orientacao_objeto.app;

import java.util.Scanner;
import orientacao_objeto.entities.Triangulo;

public class ProgramaTriangulo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        double px = 0.0, py = 0.0, areax = 0.0, areay = 0.0;

        System.out.println("Enter the measures of triangle X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        px = (x.a+x.b+x.c)/2;
        py = (y.a+y.b+y.c)/2;
        areax = Math.sqrt(px*(px-x.a)*(px-x.b)*(px-x.c));
        areay = Math.sqrt(py*(py-y.a)*(py-y.b)*(py-y.c));

        System.out.printf("Triangle X area: %.4f%n", areax);
        System.out.printf("Triangle Y area: %.4f%n", areay);
        
        if(areax > areay){
            System.out.println("Larger area: X");
        }
        else{
            System.out.println("Larger area: Y");
        }
    }
}