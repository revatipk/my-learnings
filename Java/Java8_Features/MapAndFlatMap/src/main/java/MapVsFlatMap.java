import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {
        List<Customer> customers = CustomerDAO.getAll();
        List<String> emails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        System.out.println(emails);

        System.out.println("**********Map*******");
        List<List<String>> phone = customers.stream().map(customer -> customer.getPhone()).collect(Collectors.toList());
        System.out.println(phone);

        System.out.println("**********FlatMap*******");
        List<String> phones = customers.stream().flatMap(customer -> customer.getPhone().stream()).collect(Collectors.toList());
        System.out.println(phones);
    }

}
