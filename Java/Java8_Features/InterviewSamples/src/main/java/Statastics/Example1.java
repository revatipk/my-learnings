package Statastics;

import utils.Employee;
import utils.EmployeeDatabase;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String []args){
        List<Employee> employeeList = EmployeeDatabase.getEmployees();

        //Min & Max age
        List<Integer> collect = employeeList.stream().map(e -> e.getAge()).collect(Collectors.toList());
        IntSummaryStatistics summaryStatistics = collect.stream().mapToInt(x -> x).summaryStatistics();

        System.out.println("Employee's max age : "+summaryStatistics.getMax());
        System.out.println("Employee's min age : "+summaryStatistics.getMin());
        System.out.println("Employee's average age : "+summaryStatistics.getAverage());
        System.out.println("total no of employees : "+summaryStatistics.getCount());

        //ascending/descending order
        List<Integer> collect1 = employeeList.stream().map(e -> e.getAge()).sorted().collect(Collectors.toList());
        System.out.println(collect1);

        //find 2nd and 3rd youngest employee
        List<Integer> collect2 = collect1.stream().skip(1).limit(2).collect(Collectors.toList());
        System.out.println(collect2);

        // names with delimiter
        String collect3 = employeeList.stream().map(e -> e.getName().toUpperCase()).collect(Collectors.joining(","));
        System.out.println(collect3);
    }
}
