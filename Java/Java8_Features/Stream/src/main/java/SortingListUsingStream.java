import java.util.Comparator;
import java.util.List;

public class SortingListUsingStream {
    public static void main(String []args){
        List<Employee> employees = EmployeeDatabase.getEmployees();

        /*Collections.sort(employees);
        System.out.print("Employees : "+employees);*/

        employees.stream().sorted((e1,e2)->e2.salary-e1.salary).forEach(System.out::println);

        System.out.println("\n");
        employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
        System.out.println("\n");
        employees.stream().sorted(Comparator.comparing(Employee::getId)).forEach(System.out::println);
    }
}
