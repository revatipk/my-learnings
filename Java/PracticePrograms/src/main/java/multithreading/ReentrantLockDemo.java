package multithreading;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

class worker implements Runnable{
    String name;
    ReentrantLock re;
    public worker(ReentrantLock lock,String n)
    {
        this.re=lock;
        this.name=n;
    }

    @Override
    public void run() {
        boolean done=false;
        while(!done)
        {
            boolean ans = re.tryLock();
            if(ans)
            {
                try {
                Date d = new Date();
                SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                System.out.println("task name : "+name
                                   +" outer lock acquired at "+ft.format(d)+" doing inner work");

                    Thread.sleep(1500);
                    re.lock();
                    try {
                        Date d1 = new Date();
                        SimpleDateFormat ft1 = new SimpleDateFormat("hh:mm:ss");
                        System.out.println("task name : " + name
                                + " outer lock acquired at " + ft1.format(d1) + " doing outer work");

                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        System.out.println("task name : " + name
                                + "releasing inner lock");
                        re.unlock();
                    }
                    System.out.println("Lock hold count :"+re.getHoldCount());
                    System.out.println("Task name : "+name+" work done");
                    done = true;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("task name : " + name
                            + "releasing outer lock");
                    re.unlock();
                }
                System.out.println("Lock hold count :"+re.getHoldCount());
                System.out.println("Task name : "+name+" work done");
                done = true;


            }
            else
            {
                System.out.println("task name - "+name+" waiting for lock");
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
public class ReentrantLockDemo
{
    static final int MAX_T = 2;
    public static void main(String [] args)
    {
        ReentrantLock re1 = new ReentrantLock();
        ExecutorService pool = Executors.newFixedThreadPool(MAX_T);
        Runnable w1 = new worker(re1,"Job1");
        Runnable w2 = new worker(re1,"Job2");
        Runnable w3 = new worker(re1,"Job3");
        Runnable w4 = new worker(re1,"Job4");
        pool.execute(w1);
        pool.execute(w2);
        pool.execute(w3);
        pool.execute(w4);
        pool.shutdown();
    }
}