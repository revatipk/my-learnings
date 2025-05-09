package multithreading;

public class ThreadGroupDemo {
    public static void main(String []args){
        ThreadGroup grg = new ThreadGroup("parent");
        ThreadGroup child = new ThreadGroup(grg,"child");
        NewThread t1 = new NewThread("one",grg);
        System.out.println("Starting one");
        NewThread t2 = new NewThread("two", grg);
        System.out.println("Starting two");
        System.out.println("Number of active threads in group "+grg.activeCount());
        child.destroy();
        System.out.println(child.getName()+" destoryed");
        grg.destroy();
        System.out.println(grg.getName()+" destoryed");
    }

}

class NewThread extends Thread {
    NewThread(String threadName,ThreadGroup tgob)
    {
        super(tgob,threadName);
        start();
    }
    public void run()
    {
        for(int i=0;i<1000;i++)
        {
            try{
                Thread.sleep(10);
            }
            catch (InterruptedException ex)
            {
                System.out.println("Exception encountered");
            }
        }
        System.out.println(Thread.currentThread().getName()+" finished execution");
    }
}
