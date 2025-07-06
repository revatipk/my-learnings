package Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArray {
    public static void main(String []args) {
        int []num={5,2,3,7,1};
        IntStream.range(0,num.length/2).forEach(i->{
            int temp = num[i];
            num [i]= num[num.length-i-1];
            num[num.length-i-1] = temp;

        });
        System.out.println(Arrays.toString(num));
    }
}
