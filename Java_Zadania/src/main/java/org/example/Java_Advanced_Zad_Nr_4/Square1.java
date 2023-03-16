package org.example.Java_Advanced_Zad_Nr_4;

public class Square1 extends Rectangle1 {
    public Square1() {
    }

    public Square1(String color, boolean isFilled, double size) {
        super(color, isFilled, size, size);
    }

    public Square1(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(width);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setWidth(width);
    }

    @Override
    public String toString() {
        return String.format("Square with width = %.2f and length = %.2f which is subclass off %s", width, length, super.toString());
    }
}
