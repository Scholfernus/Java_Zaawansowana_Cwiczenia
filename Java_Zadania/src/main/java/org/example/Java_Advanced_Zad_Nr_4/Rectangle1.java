package org.example.Java_Advanced_Zad_Nr_4;

public class Rectangle1 extends Shape1{
    protected double length, width;

    public Rectangle1() {
        super();
        this.length = 1;
        this.width = 1;
    }

    public Rectangle1(String color, boolean isFilled, double length, double width) {
        super(color, isFilled);
        this.length = length;
        this.width = width;
    }

    public Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public float getArea() {
        return (float) (width * length);
    }
    @Override
    public float getPerimeter() {
        return (float) (2 * width + 2 * length);
    }

    @Override
    public String toString() {
        return String.format("Rectangle with width = %.2f and length = %.2f which is a subclass of %s ", length, width, super.toString());
    }
}
