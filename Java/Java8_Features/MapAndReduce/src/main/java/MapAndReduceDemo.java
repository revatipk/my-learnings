import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapAndReduceDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,34,21,5,76,23);
        int sum = numbers.stream().mapToInt(i->i).sum();
        System.out.println("SUm with Map : "+sum);

        int sum1 = numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println("SUm with Reduce : "+sum1);

        Optional<Integer> sum2 = numbers.stream().reduce(Integer::sum);
        System.out.println("SUm with Reduce : "+sum2.get());

        int maximum = numbers.stream().reduce((a,b)->a>b?a:b).get();
        System.out.println("Max number : "+maximum);
    }
}
