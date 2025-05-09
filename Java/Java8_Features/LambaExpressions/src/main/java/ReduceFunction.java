import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReduceFunction {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(12,45,76,34,23,99);
        List<Integer> even = list.stream().reduce(new ArrayList<>(),(a,b)->{
            if(b%2==0)
                a.add(b);
            return a;
        }, (a, b) -> {
                    a.addAll(b);
                    return  a;
                });
        System.out.println("Even.."+even);
    }

}
