package generics.tipoCuringaDelimitado.application;

import java.util.ArrayList;
import java.util.List;

import generics.tipoCuringaDelimitado.model.entities.Circle;
import generics.tipoCuringaDelimitado.model.entities.Rectangle;
import generics.tipoCuringaDelimitado.model.interfaces.Shape;

public class Program {
    public static void main(String[] args) {
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.println("Total area: " + totalArea(myCircles));


    }
    public static double totalArea(List<? extends Shape> list) { //Eu aceito uma lista de qualquer coisa que seja Shape ou que herde de Shape
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    } 
}
