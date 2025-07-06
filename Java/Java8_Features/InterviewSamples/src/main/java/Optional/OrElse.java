package Optional;

import utils.Employee;
import utils.EmployeeDatabase;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OrElse {
    public static void main(String []args) {
        List<Employee> employees = EmployeeDatabase.getEmployees();
        List<String> collect = employees.stream().map(e -> e.getName()).collect(Collectors.toList());
        List<String> collect1 = collect.stream().map(e -> Optional.ofNullable(e).orElse("Anonymous")).collect(Collectors.toList());
        List<String> collect2 = collect.stream().map(e -> Optional.ofNullable(e).orElseGet(()->"Anonymous")).collect(Collectors.toList());
        System.out.println(collect1);
    }
}
