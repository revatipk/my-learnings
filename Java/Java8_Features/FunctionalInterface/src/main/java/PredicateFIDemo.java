import java.util.Arrays;
import java.util.List;

public class PredicateFIDemo {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDatabase.getEmployees();
        employees.stream().filter(t->t.salary>40).forEach(System.out::println);
        System.out.println("\n");
        employees.stream().filter(t->t.salary<40).forEach(System.out::println);
        List<Integer> list = Arrays.asList(56,23,12,45,78);
        list.stream().filter(t->t%2==0).forEach(System.out::println);
    }
}
