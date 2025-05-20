import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByEx {
    public static void main(String []args) {
        List<String> list = Arrays.asList("Papanna","Prema","Shilpa","Revati","Mitali","Saachi","Saachi");
       Map<String, Long> result = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);
    }
}
