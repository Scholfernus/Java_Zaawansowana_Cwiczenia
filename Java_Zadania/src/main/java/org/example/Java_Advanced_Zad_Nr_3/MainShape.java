package org.example.Java_Advanced_Zad_Nr_3;

public class MainShape {
    public static void main(String[] args) {
        Shape shape = new Shape("red",false);
        System.out.println(shape);
        shape.setColor("green");
        shape.setFilled(true);
        System.out.println(shape);
        Shape circle = new Circle("blue", true, 20);
        System.out.println(circle);
        Shape rectangle = new Rectangle("brown",true, 20,10);
        System.out.println(rectangle);
        Shape square = new Square("dark",true,15);
        System.out.println(square);
    }
}
