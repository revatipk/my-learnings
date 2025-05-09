package java8;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main (String []args)
    {
        List<String> names = Arrays.asList("Ram","Shama","Radha","Krishna","Vishnu","Shiva");
        StringJoiner sj = new StringJoiner(",");
        System.out.println(sj.toString());
        sj.add(names.get(0)).add(names.get(1));
        System.out.println(sj.toString());
String.j
str.joi
        StringJoiner sj1 = new StringJoiner(":");
        System.out.println(sj1.toString());
        sj1.add(names.get(2)).add(names.get(3));
        System.out.println(sj1.toString());

        sj.merge(sj1);

        System.out.println("After merge : "+ sj.toString());
        System.out.println("Length "+sj.length());
    }
}
