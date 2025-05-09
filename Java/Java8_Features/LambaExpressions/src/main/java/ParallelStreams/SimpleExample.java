package ParallelStreams;

import java.util.Arrays;
import java.util.List;

public class SimpleExample {
    public static void main(String []args){
        List<String> list
                = Arrays.asList("Hello "," "," W","O","R","L","D");
        list.parallelStream().forEachOrdered(System.out::print);
    }
}
