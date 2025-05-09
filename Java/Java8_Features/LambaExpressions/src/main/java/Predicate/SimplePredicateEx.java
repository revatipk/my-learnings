package Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SimplePredicateEx {
    public static void main(String args[]) {
        List<String> n = Arrays.asList("Tanu","Manu","Rita","Siri","Ria","Revati");
        Predicate<String> p = (s)->s.startsWith("R");

        for (String st:n ) {
            if(p.test(st))
                System.out.println(st);

        }
    }
}
