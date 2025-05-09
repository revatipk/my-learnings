import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortBasedOnSecDigit {
    public static void main(String []args) {
        List<Integer> list = Arrays.asList(34, 583, 121, 615);
        System.out.println("Before sorting.."+list);

        Collections.sort(list,(a1,a2)->{
            return a1%10>a2%10?1:-1;
        });
        System.out.println("After sorting.."+list);
    }

}
