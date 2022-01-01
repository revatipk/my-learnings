import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortTreeMap {
    public static void main(String[] args) {
        /*Map<Employee,Integer> employees = new TreeMap<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary()-o2.getSalary();
            }
        });*/
        Map<Employee,Integer> employees = new TreeMap<>((o1,  o2) ->o1.getId()-o2.getId());

        employees.put(new Employee(200, "Anusha", 123456789, 30), 10);
        employees.put(new Employee(100, "Deepa", 234567891, 54), 20);
        employees.put(new Employee(300, "Chitra", 345678912, 21), 30);
        employees.put(new Employee(400, "Raj", 456789123, 65), 40);
        employees.put(new Employee(500, "Varsha", 567892134, 34), 50);
        employees.put(new Employee(600, "Vanya", 678912345, 66), 60);
        employees.put(new Employee(700, "Lasya", 789123456, 71), 70);

        System.out.println(employees);

        System.out.println("**********Streams*************");
        employees.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName))).forEach(System.out::println);

        System.out.println("**********Streams Reverse Order*************");
        employees.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName).reversed())).forEach(System.out::println);
    }
}
