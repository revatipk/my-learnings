package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArraylistToHashMap {
    public static void main(String []args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Mitali");
        arrayList.add("Revati");
        arrayList.add("Shilpa");
        arrayList.add("Saachi");
        arrayList.add("Siri");

        System.out.println("Elements in ArrayList are.."+arrayList);

        HashMap<String,Integer> res = arrayList.stream().collect(Collectors.toMap(Function.identity(), String::length,(e1,e2)->e1,HashMap::new));

        System.out.println("Elements in HasMap are.."+res);
    }
}
