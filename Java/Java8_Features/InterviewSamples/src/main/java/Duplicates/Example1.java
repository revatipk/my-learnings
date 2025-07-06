package Duplicates;

import utils.Employee;
import utils.EmployeeDatabase;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String []args){
        List<Employee> employeeList = EmployeeDatabase.getEmployees();
        List<String> collect = employeeList.stream().map(e -> e.getName()).collect(Collectors.toList());
        Set<String> strings = new HashSet<>();
        List<String> collect1 = collect.stream().filter(name -> !strings.add(name)).collect(Collectors.toList());
        System.out.println(collect1);
        System.out.println(strings);
    }
}
