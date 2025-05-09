import java.util.Arrays;
import java.util.List;

public class DistinctExample {
    private static void findDistinctElements(List<Integer> intList)
    {
       System.out.println("Before sorting");
       intList.stream().distinct().forEach(System.out::println);
        System.out.println("after sorting");
        intList.stream().distinct().sorted().forEach(System.out::println);
    }
    public static void main(String []args) {
        findDistinctElements(Arrays.asList(132,45,12,456,12,132));
    }
}
