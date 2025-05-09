package Comparator;

import java.util.Arrays;
import java.util.List;

public class ComparatorExample {
    public static void main(String []args) {
        List<String> names = Arrays.asList("Revati","Shilpa","Mitali","Siri","Saachi");
        names.sort((s1,s2)->s2.compareTo(s1));
        System.out.println(names);
    }
}
