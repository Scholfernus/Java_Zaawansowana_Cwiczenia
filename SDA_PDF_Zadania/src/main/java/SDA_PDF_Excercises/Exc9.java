package SDA_PDF_Excercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class Exc9 {
    public static class EmployeeSalary {
        private String name;
        private int salary;
        private int id;

        public EmployeeSalary(String name, int salary, int id) {
            this.name = name;
            this.salary = salary;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public int getSalary() {
            return salary;
        }

        public int getId() {
            return id;
        }
    }

    public static void main(String[] args) {


        List<EmployeeSalary> employeeSalary = new ArrayList<>();
        employeeSalary.add(new EmployeeSalary("Johnny", 3500, 1));
        employeeSalary.add(new EmployeeSalary("Mike", 4590, 2));
        employeeSalary.add(new EmployeeSalary("Rick", 3590, 3));
        employeeSalary.add(new EmployeeSalary("Steve", 3190, 4));

        Integer maxSalary = employeeSalary.stream()
                .map(EmployeeSalary::getSalary)
                .max(Comparator.naturalOrder())
                .orElseThrow(NoSuchElementException::new);
        System.out.println(maxSalary);
    }
}