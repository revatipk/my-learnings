package jvm;

public class ShutdownHook {
    public static void main(String []args)
    {
        Runtime.getRuntime().addShutdownHook(new Thread(){

            public void run(){
                System.out.println("Shuting Hook is running!");
            }
        });
        System.out.println("Application Terminating..");
    }
}
