package Collections;

import java.util.TreeMap;
import java.util.TreeSet;

public class SortTreeSet {
    public static void main (String []args) {
        TreeSet<Integer> treeSet = new TreeSet<>((o1,o2)->o1.compareTo(o2));
        treeSet.add(23);
        treeSet.add(64);
        treeSet.add(10);
        treeSet.add(3);
        System.out.println("Elements of the TreeSet after" +
                " sorting are: " + treeSet);
        TreeMap<Integer,String> stringTreeMap = new TreeMap<>((o1, o2)->o1.compareTo(o2));
        stringTreeMap.put(1, "Apple");
        stringTreeMap.put(4, "Mango");
        stringTreeMap.put(5, "Orange");
        stringTreeMap.put(2, "Banana");
        stringTreeMap.put(3, "Grapes");
        System.out.println("Elements of the TreeMap " +
                "after sorting are : " + stringTreeMap);
    }
}
