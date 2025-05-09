package multithreading;

public class RunnableDemo{
  /*  @Override
    public void run() {
        System.out.println("THread "+Thread.currentThread().getName()+" is running");
    }
    public static void main(String []args)
    {
        RunnableDemo runnableDemo = new RunnableDemo();
        for(int i=0;i<5;i++)
        {
            Thread thread = new Thread(new RunnableDemo());
            thread.start();
        }
    }*/

    public static void main(String []args)
    {
        RunnableDemo runnableDemo = new RunnableDemo();
        for(int i=0;i<5;i++)
        {
            Thread thread = new Thread(()->System.out.println(Thread.currentThread().getName()));
            thread.start();
        }
    }
}
