package org.example.Java_Advanced_Zad_Nr_2;

public class Staff extends Person {
    public String specialization;
    public int salary;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staff {" +
                "specialization ='" + specialization + '\'' +
                ", salary = " + salary +
                '}';
    }
}

