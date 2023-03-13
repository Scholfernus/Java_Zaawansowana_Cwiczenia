package org.example.Java_Advanced_Zad_Nr_2;

public class Student extends Person {
public String kindStudy;
public int yearStudy;
public double costStudy;

    public Student(String kindStudy, int yearStudy, double costStudy) {
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

    public void setCostStudy(double costStudy) {
        this.costStudy = costStudy;
    }

    @Override
    public String toString() {
        return "Student{" +
                "kindStudy='" + kindStudy + '\'' +
                ", yearStudy=" + yearStudy +
                ", costStudy=" + costStudy +
                '}';
    }
}
