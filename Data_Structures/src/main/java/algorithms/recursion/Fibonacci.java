package algorithms.recursion;

// Given a number N return the index value of the Fibonacci sequence,
// where the sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 ...

// the pattern of the sequence is that each value is the sum of the
// 2 previous values, that means that for N=5 → 2+3

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

//For example: fibonacciRecursive(6) should return 8
public class Fibonacci {

    public int fibonacciIter(int input)
    {
        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);

        for(int i=2;i<=input;i++){
            list.add(list.get(i-1)+list.get(i-2));
        }
        return list.get(input);
    }
    public int fibonacciRecur(int input){
        if (input == 0) {
            return 0;
        } else if (input == 1 || input == 2) {
            return 1;
        }
        return fibonacciRecur(input-1)+fibonacciRecur(input-2);
    }
    public static void main(String []args)
    {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fibonacciRecur(5));
        System.out.println(fibonacci.fibonacciIter(6));
    }
}
