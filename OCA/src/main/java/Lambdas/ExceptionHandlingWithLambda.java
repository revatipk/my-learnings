/*
package Lambdas;

import java.util.function.BiConsumer;

public class ExceptionHandlingWithLambda {


    public static void main(String []args)
    {
        int numbers[]={1,2,3,4};
        int key=0;
        process(numbers, key,wrapperLambda((v,k)->System.out.println(v / k)));
    }
    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer){
        for(int i:someNumbers){
            consumer.accept(i,key);
        }

    }
    private static BiConsumer<Integer,Integer> wrapperLambda(BiConsumer<Integer,Integer> consumer)
    {
//        return consumer;
//        return (v,k)-> System.out.println(v / k);
        return (v,k) -> {
            try{
                consumer.accept(v,k);
            }
            catch(ArithmeticException ex)
            {
                System.out.println("Caught the Exception");
            }

        };
    }
}
*/
