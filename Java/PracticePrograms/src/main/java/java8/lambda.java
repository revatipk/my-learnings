package java8;

public class lambda {
    public static void main(String [] args)
    {
        Thread thread = new Thread(()->System.out.print("Creating thread using lambda"));
        thread.start();
    }
}
