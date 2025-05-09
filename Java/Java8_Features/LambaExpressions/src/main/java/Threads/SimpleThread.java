package Threads;

public class SimpleThread {
    public static void main(String []args) {
        Thread thread = new Thread(()->{
            Thread.currentThread().setName("myThread");
            System.out.println(
                    Thread.currentThread().getName()
                            + " is running");
        });
        thread.start();
    }
}
