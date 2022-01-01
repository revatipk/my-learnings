import java.util.*;

public class SortMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(12,"One");
        map.put(22,"Two");
        map.put(23,"Three");
        map.put(89,"Nine");
        map.put(43,"Four");
        map.put(56,"Six");

        List<Map.Entry<Integer,String>> entries = new ArrayList<>(map.entrySet());
        /*Collections.sort(entries, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });*/

//        Collections.sort(entries, ( o1, o2) -> o1.getKey().compareTo(o2.getKey()));
        System.out.println(entries);

        //Using Stream
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
//        map.entrySet().stream().sorted((Comparator<? super Map.Entry<Integer, String>>) Map.Entry.comparingByValue().reversed()).forEach(System.out::println);

    }
}
