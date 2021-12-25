public class Fizz {
    int x=5;
    public static void main(String []arg)
    {
        final Fizz f1 = new Fizz();
        Fizz f2 = new Fizz();
        Fizz f3 = FizzSwitch(f1,f2);
        System.out.println((f1==f3)+ " "+(f1.x==f3.x));

    }
    static  Fizz FizzSwitch(Fizz f1, Fizz f2)
    {
        final Fizz z = f1;
        z.x = 6;
        return z;

    }
}
