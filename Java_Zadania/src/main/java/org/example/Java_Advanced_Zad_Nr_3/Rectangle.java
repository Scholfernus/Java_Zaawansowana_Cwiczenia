package org.example.Java_Advanced_Zad_Nr_3;

public class Rectangle extends Shape {
    protected double length, width;

    public Rectangle() {
        super();
        this.length = 1;
        this.width = 1;
    }

    public Rectangle(String color, boolean isFilled, double length, double width) {
        super(color, isFilled);
        this.length = length;
        this.width = width;
    }

    public Rectangle(String color, boolean isFilled) {
        super(color, isFilled);
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

    public float getArea() {
        return (float)(length * width);
    }

    public float getPerimeter() {
        return (float)( 2 * (width + length));
    }

    @Override
    public String toString() {
        return String.format("Rectangle with width = %f and length = %f which is a subclass of %s ", length, width, super.toString());
    }
}
