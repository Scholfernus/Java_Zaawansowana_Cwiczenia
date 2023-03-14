package org.example.Java_Advanced_Zad_Nr_3;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(String color, boolean isFilled, double size) {
        super(color, isFilled, size, size);
    }

    public Square(String color, boolean isFilled) {
        super(color, isFilled);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(width);
        super.setWidth(length);
    }

    @Override
    public String toString() {
        return String.format("Square with width= %f and length = %f which is subclass off %s", width, length, super.toString());
    }
}
