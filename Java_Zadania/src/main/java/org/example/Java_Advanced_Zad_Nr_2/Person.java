package org.example.Java_Advanced_Zad_Nr_2;

public class Person {
    public String name;
    public String address;

    public Person() {
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person {" + "name ='" + name + '\'' + ", address='" + address + '\'' + '}';
    }
}
