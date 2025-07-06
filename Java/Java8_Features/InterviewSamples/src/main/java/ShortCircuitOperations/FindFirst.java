package ShortCircuitOperations;

import utils.Employee;
import utils.EmployeeDatabase;

import java.util.List;

public class FindFirst {
    public static void main(String []args) {
        List<Employee> employeeList = EmployeeDatabase.getEmployees();
        System.out.println(employeeList.stream().filter(e->e.getName().contains("Pre")).findFirst());

    }
}
