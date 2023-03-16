package org.example.Java_Advanced_Zad_Nr_4;

abstract class Shape1 {
    private String color;
    private boolean isFilled;

    protected Shape1(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }
    protected Shape1(){
        this.color = "Unknown";
        this.isFilled = false;
    }
    public abstract float getArea();
    public abstract float getPerimeter();

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected boolean isFilled() {
        return isFilled;
    }

    protected void setFilled(boolean filled) {
        isFilled = filled;
    }

    @Override
    public String toString() {
        return String.format("Shape with color of %s and  %s ", color, isFilled ? "\"filled\"" : "\"NotFilled\"");
    }
}
