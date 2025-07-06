package Arrays;

import java.sql.Array;
import java.util.Arrays;

public class Java8ArrayProblems {
    public static void main(String[] args) {
        int[] number = {4, 8, 1, 4, 0, 2};
        fetchSmallestSecondNum(number);

        number = new int[]{4, 0, 8, 1, 4, 0, 2};
        fetchDistinctSmallestSecondNum(number);
    }

    private static void fetchDistinctSmallestSecondNum(int[] number) {
        int smallest = Arrays.stream(number).distinct().skip(1).findFirst().orElseThrow(() -> new IllegalArgumentException("not found"));
        System.out.println(smallest);
    }
    private static void fetchSmallestSecondNum(int[] number) {
        int smallest = Arrays.stream(number).sorted().skip(1).findFirst().orElseThrow(()->new IllegalArgumentException("Number not present"));
        System.out.println("Second smallest number:"+smallest);
    }
}
