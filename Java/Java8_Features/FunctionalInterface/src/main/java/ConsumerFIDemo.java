import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsumerFIDemo {
    public static void main(String[] args) {
        /*List<Employee> employees = Database.getEmployees();
        employees.stream().forEach(System.out::println);*/

        List<Integer> list = Arrays.asList(56,23,12,45,78);
//        list.stream().forEach(l->System.out.println(l));
        list.stream().forEach(System.out::println);
    }
}
