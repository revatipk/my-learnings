import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static Employee getEmployeeByName(String name){
        List<Employee> employees = EmployeeDatabase.getEmployees();
        return employees.stream().filter(employee -> employee.getName().equalsIgnoreCase(name)).findAny().get();

    }
    public static void main(String[] args) {
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        Employee employee = new Employee(250,null, 32453426,67);
        Optional<Object> emptyName  = Optional.ofNullable(employee.getName());
        System.out.println(emptyName.orElse("name"));
//        System.out.println(emptyName.orElseThrow(()->new IllegalArgumentException("name is null")));
        System .out.println(OptionalDemo.getEmployeeByName("PRema"));
    }
}
