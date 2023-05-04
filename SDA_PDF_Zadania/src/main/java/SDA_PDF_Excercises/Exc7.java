package SDA_PDF_Excercises;

import com.sun.jdi.request.ExceptionRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Exc7 {

    public static class Employee {
        private Integer id;
        private String name;
        private Integer salary;

        public Employee(Integer id, String name, Integer salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public Integer getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public Integer getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }


    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(1, "Kowalsky", 3000));
        employeeList.add(new Employee(2, "Nowak", 4500));
        employeeList.add(new Employee(3, "Valeczny", 5200));
        employeeList.add(new Employee(4, "FFF", 5288));

        Employee employee = employeeList.stream()
                .filter(Objects::nonNull).
                filter(s -> s.getSalary() > 3000)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Nie znaleziono"));
    }
}

