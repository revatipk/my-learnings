package utils;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDatabase {
    public static List<Employee> getEmployees()
    {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(400,"David",123456,30,25));
        employees.add(new Employee(500,"Dev",123457,25,30));
        employees.add(new Employee(600,"Rajesh",123458,67,35));
        employees.add(new Employee(700,"Reshma",123459,42,40));
        employees.add(new Employee(800,"Mitali",223456,56,25));
        employees.add(new Employee(900,"Shilpa",323456,67,30));
        employees.add(new Employee(100,"Siri",423456,12,35));
        employees.add(new Employee(200,"Saachi",523456,10,40));
        employees.add(new Employee(300,"Prema",623456,50,45));
        employees.add(new Employee(350,"Prema",623456,50,45));
        employees.add(new Employee(350,null,623456,50,50));

        return employees;
    }
}
