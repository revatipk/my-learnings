package Sorting;

import utils.Employee;
import utils.EmployeeDatabase;

import java.util.List;
import java.util.stream.Collectors;


public class SortEmp {
    public static void main(String []args) {
        List<Employee> employeeList = EmployeeDatabase.getEmployees();
        //GIven an employee list sort employees based on their salaries in dec order
        System.out.println(employeeList.stream().sorted((e1,e2)->(int)(e2.getSalary()-e1.getSalary())).collect(Collectors.toList()));
        //top 3
        System.out.println(employeeList.stream().sorted((e1,e2)->(int)(e2.getSalary()-e1.getSalary())).limit(3).collect(Collectors.toList()));

    }
}
