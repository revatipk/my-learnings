import java.util.List;

public class SupplierFIDemo {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDatabase.getEmployees();
        System.out.println(employees.stream().findAny().orElseGet(()->new Employee(0,null,0,0)));

   /*     List<Integer> list = Arrays.asList(56,23,12,45,78);
//        list.stream().forEach(l->System.out.println(l));
        list.stream().forEach(System.out::println);*/
    }
}
