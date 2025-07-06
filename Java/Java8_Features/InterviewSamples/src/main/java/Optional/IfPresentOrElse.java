package Optional;

import utils.Employee;
import utils.EmployeeDatabase;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Given an employee table, fetch the employee with give id and print its name in upper case
//If name is null print "the name is null"
public class IfPresentOrElse {
    public static void main(String []args) {
        List<Employee> employeeList = EmployeeDatabase.getEmployees();
        List<Employee> collect = employeeList.stream().filter(e -> e.getId() == 420).collect(Collectors.toList());
        Employee employee = collect.get(0);
        Optional<String> name = Optional.ofNullable(employee.getName());

        name.ifPresent(n->System.out.println(n.toUpperCase()));
    }
}
