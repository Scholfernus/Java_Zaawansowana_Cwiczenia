package org.example.Java_Advanced_Zad_Nr_3;

import java.awt.*;

public class Shape {
private String color;
private boolean isFilled;

    public Shape() {
        this.color = "unknown";
        this.isFilled = false;
    }

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    @Override
    public String toString() {
        return String.format("Shape with color of %s and  %s ", color, isFilled ? "\"filled\"" : "\"NotFilled\"");
    }
}
