package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapEx {
    public static void main(String []args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(20);
        marks.add(56);
        marks.add(23);
        marks.add(76);
        marks.add(60);
        System.out.println("Marks before grace.."+marks);
        List<Integer>  updatedmarks = marks.stream().map(i->i+6).collect(Collectors.toList());
        System.out.println("Marks after grace"+updatedmarks);

    }
}
