package SDA_PDF_Excercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exc8 extends Exc7 {
    List<Employee> employeeList = new ArrayList<>();



    List<Employee> employeeListSorted = employeeList
            .stream()
            .sorted(Comparator.comparing(Employee::getName))
            .collect(Collectors.toList());
}
