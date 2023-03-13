package org.example.Java_Advanced_Zad_Nr_2;

public class MainPerson {
    public static void main(String[] args) {
     Person person = new Person("John Kovalsky", "Druciana 6");
    person.setName("Janusz Kovalsky");
    Staff staff = new Staff();
    staff.setSalary(10000);
    staff.setSpecialization("Teacher");
        System.out.println(staff);
        Student student = new Student("Philosophy", 3, 1500);
        student.setAddress("Tulipan Str. 9");
        student.setName("Morrow");
        System.out.println(person);
        System.out.println(student);
        System.out.println(person.getName());
        System.out.println(student.getName() + " " + staff.getSalary());
    }
}
