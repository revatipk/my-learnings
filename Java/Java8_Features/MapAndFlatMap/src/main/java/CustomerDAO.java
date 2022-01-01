import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDAO {
    public static List<Customer> getAll(){
        return Stream.of(
                new Customer(101,"Anusha","anusha@gmail.com", Arrays.asList("1234","234")),
                new Customer(102,"Binni","binni@gmail.com", Arrays.asList("45435","7567")),
                new Customer(103,"Chitra","chitra@gmail.com", Arrays.asList("4345","2312")),
                new Customer(104,"Deva","deva@gmail.com", Arrays.asList("56456","23123")),
                new Customer(105,"Varsha","varsha@gmail.com", Arrays.asList("5464564","23123")),
                new Customer(106,"Raj","raj@gmail.com", Arrays.asList("56456","23123"))
        ).collect(Collectors.toList());
    }
}
