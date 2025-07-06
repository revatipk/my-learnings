package Groupby;

import utils.Employee;
import utils.EmployeeDatabase;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateGroupBy {
    public static void main(String []args) {
        List<Employee> employeeList = EmployeeDatabase.getEmployees();
        List<String> collect = employeeList.stream().map(e -> e.getName()).collect(Collectors.toList());

        //aggregate
        Map<String, Long> collect1 = collect.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect1);

        //duplicate entry name
        Set<String> collect2 = collect1.entrySet().stream().filter(entry -> entry.getValue() > 1).map(entry -> entry.getKey()).collect(Collectors.toSet());
        System.out.println(collect2);

        // options to find the duplicate

        Set<String> collect3 = collect.stream().filter(name -> Collections.frequency(collect, name) > 1).collect(Collectors.toSet());
        System.out.println("Duplicate Option:"+collect3);
    }
}
