package StreamMethods;

import java.util.Comparator;
import java.util.stream.Stream;

public class SteamOfExample {
    public static void main(String []args) {
        Stream<String> stream = Stream.of("Revati","Siri","Mitali","Saachi","Prema","Shilpa");
        stream.flatMap(str->Stream.of(str.charAt(2))).forEachOrdered(System.out::println);

        // Using forEach(Consumer action) to print
        // Character at index 1 in reverse order
       /* stream.sorted(Comparator.reverseOrder())
                .flatMap(str -> Stream.of(str.charAt(1)))
                .forEach(System.out::println);*/
    }
}
