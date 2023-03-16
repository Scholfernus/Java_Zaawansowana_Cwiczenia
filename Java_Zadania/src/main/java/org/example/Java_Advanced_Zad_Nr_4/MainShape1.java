package org.example.Java_Advanced_Zad_Nr_4;

public class MainShape1 {
    public static void main(String[] args) {
        
        Shape1 []shape1s = {
                new Circle1("Red", true, 15),
                new Rectangle1("Black",false,12,15),
                new Square1("Yellow",true,25),
        };
        for (Shape1 shape1 : shape1s)
        {
            System.out.println(shape1);
            System.out.println(shape1.getPerimeter());
            System.out.println(shape1.getArea());
        }
    }
}
