package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortArrayList {
    public static void main(String []args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(45);
        list.add(59);
        list.add(11);
        list.add(32);
        System.out.println("Before Sorting.."+list);


        Collections.sort(list, (o1,o2)->o1.compareTo(o2));
        System.out.println("After Sorting Ascending.."+list);

        Collections.sort(list, (o1,o2)->o2.compareTo(o1));
        System.out.println("After Sorting Descending.."+list);

    }
}
