package Arrays;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningBy {
    public static void main(String []args) {
        List<Integer> numbers = Arrays.asList(3,5,3,623,17,41,54,64,56);
        //Partitioning even/odd
        Map<Boolean, List<Integer>> collect = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(collect);

        //Counting
        Long collect1 = numbers.stream().collect(Collectors.counting());
        System.out.println(collect1);

        IntSummaryStatistics collect2 = numbers.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println("Summary : "+collect2.getCount()+" "+collect2.getMin()+" "+collect2.getMax()+" "+ collect2.getAverage() );
    }
}
