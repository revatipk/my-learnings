import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsDemo {

    public static void main(String []args) {
        List<String> list = Arrays.asList("Papanna","Prema","Shilpa","Revati","Mitali","Saachi","Saachi");
        // collecting names by length
     //  System.out.println(list.stream().collect(Collectors.groupingBy(x->x.length())));

       //Count the occurrence
        String occurrence = "Hello World Hello India";
       System.out.println(Arrays.stream(occurrence.split(" ")).collect(Collectors.groupingBy(x->x, Collectors.counting())));

       // Even / odd

        Stream<Integer>
                s = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(s.collect(Collectors.partitioningBy(num->num%2==0)));

        //Summing values in the Map
        Map<String, Integer> items = new HashMap<>();
        items.put("Shilpa", 44);
        items.put("Revati", 42);
        items.put("Mitali",15);

        System.out.println(items.values().stream().reduce(Integer::sum));
        System.out.println(items.values().stream().collect(Collectors.summingInt(x->x)));

        // Map from stream Elements
        System.out.println(list.stream().collect(Collectors.toMap(x->x.toUpperCase(), x->x.length())));
    }
}
