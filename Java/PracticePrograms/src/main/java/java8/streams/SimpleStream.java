package java8.streams;

import java.util.Arrays;
import java.util.List;

public class SimpleStream {
    public static void main(String []args){
        List<String> names = Arrays.asList("Siri","Saachi","Mitali");
        names.stream().sorted().forEach(x-> System.out.println(x));

        Integer []numbers ={32,45,12,65,23};
        Arrays.stream(numbers).filter(x->x%2==0).forEach(x-> System.out.println(x));
       int sum =  Arrays.stream(numbers).reduce(Integer::sum).get();
        System.out.println("Sum : "+sum);

        int max= Arrays.stream(numbers).reduce((a,b)-> a>b?a:b).get();
        System.out.println("Max : "+max);

    }
}
