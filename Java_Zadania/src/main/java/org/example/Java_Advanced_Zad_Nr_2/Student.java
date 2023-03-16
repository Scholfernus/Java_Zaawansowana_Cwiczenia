package org.example.Java_Advanced_Zad_Nr_2;

public class Student extends Person {
private String kindStudy;
private int yearStudy;
private float costStudy;

    public Student(String kindStudy, int yearStudy, float costStudy) {
        this.kindStudy = kindStudy;
        this.yearStudy = yearStudy;
        this.costStudy = costStudy;
    }

    public Student(String name, String address, String kindStudy, int yearStudy, float costStudy) {
        super(name, address);
        this.kindStudy = kindStudy;
        this.yearStudy = yearStudy;
        this.costStudy = costStudy;
    }

    public String getKindStudy() {
        return kindStudy;
    }

    public int getYearStudy() {
        return yearStudy;
    }

    public double getCostStudy() {
        return costStudy;
    }

    public void setKindStudy(String kindStudy) {
        this.kindStudy = kindStudy;
    }

    public void setYearStudy(int yearStudy) {
        this.yearStudy = yearStudy;
    }

    public void setCostStudy(float costStudy) {
        this.costStudy = costStudy;
    }

    @Override
    public String toString() {
        return "Student{" +
                "kindStudy='" + kindStudy + '\'' +
                ", yearStudy=" + yearStudy +
                ", costStudy=" + costStudy +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
