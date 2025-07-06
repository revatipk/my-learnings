package Groupby;

import utils.Employee;
import utils.EmployeeDatabase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String []args) {
        List<Employee> employeeList = EmployeeDatabase.getEmployees();
        //Group by only age
        Map<Integer, List<Employee>> collect = employeeList.stream().collect(Collectors.groupingBy(e -> e.getAge()));
        System.out.println(collect);

        //get Unique entry, implement hashCode() equal() in Employee
        Map<Integer, Set<Employee>> collect1 = employeeList.stream().collect(Collectors.groupingBy(e -> e.getAge(), Collectors.toSet()));
        System.out.println(collect1);

        //sort
        Map<Integer, Set<Employee>> collect2 = employeeList.stream().collect(Collectors.groupingBy(e -> e.getAge(), TreeMap::new,Collectors.toSet()));
        System.out.println(collect2);
    }
}
