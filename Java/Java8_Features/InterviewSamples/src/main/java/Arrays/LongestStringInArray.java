package Arrays;

import java.util.Arrays;

public class LongestStringInArray {
    public static void main(String []args) {
        String []strings = {"Apple","Banana","Avocado","Apricot","Grapes"};
        int i = Arrays.stream(strings).mapToInt(string -> string.length()).max().orElse(0);
        System.out.println("Length of string with max length: "+i);
    }
}
