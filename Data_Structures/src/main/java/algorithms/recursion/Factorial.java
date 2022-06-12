package algorithms.recursion;

public class Factorial {
    public int factorialIter(int input)
    {
        int ret = 1;
        if(input==2)
        {
            return 2;
        }
        else
        {
            for(int i=2;i<=input;i++)
            {
                ret = ret*i;
            }
        }
        return ret;
    }
    public int factorialRecur(int input)
    {
       if(input==2)
           return 2;
       return input*factorialRecur(input-1);
    }
    public static void main(String args[])
    {
        Factorial factorial = new Factorial();
        System.out.println("Factorial of 4 : "+ factorial.factorialRecur(4));
    }
}
