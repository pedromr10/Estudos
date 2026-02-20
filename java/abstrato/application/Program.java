package abstrato.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import abstrato.entities.Circle;
import abstrato.entities.Rectangle;
import abstrato.entities.Shape;
import abstrato.enums.Color;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            System.out.printf("Shape #%d data", i+1);
            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if(ch == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                Shape rect = new Rectangle(color, width, height);
                list.add(rect);
            }
            else{
                System.out.print("Radius: ");
                double rad = sc.nextDouble();
                Shape circ = new Circle(color, rad);
                list.add(circ);
            }

        }
        System.out.println();
        System.out.println("SHAPE AREAS:");
        for(Shape shape : list){
            System.out.println(shape.area());
        }

        sc.close();
    }
}
