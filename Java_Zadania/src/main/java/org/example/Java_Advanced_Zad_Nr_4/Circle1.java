package org.example.Java_Advanced_Zad_Nr_4;

public class Circle1 extends Shape1{
    private float radius;
    public Circle1() {
        super();
        this.radius = 1;
    }

    public Circle1(String color, boolean isFilled, float radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public Circle1(float radius) {
        this.radius = radius;
    }

    protected Circle1(String color, boolean isFilled) {
        super(color, isFilled);
    }

    @Override
    public float getArea() {
        return 0;
    }

    @Override
    public float getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Circle with radius = %.2f which is subclass of %s ", radius, super.toString());
    }
}
