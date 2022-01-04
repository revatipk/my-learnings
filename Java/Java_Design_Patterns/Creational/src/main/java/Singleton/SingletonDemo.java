public class SingletonDemo {
    private static SingletonDemo instance;

    private SingletonDemo() {

    }
//    Early instantiation
    /*
    private static SingletonDemo instance = new SingletonDemo();
    public static SingletonDemo getInstance() {
        return instance;
    }*/


    //Simple
   /* public static SingletonDemo getInstance() {
    if(null==instance)
        instance=new SingletonDemo();

        return instance;
    }*/

    //Thread safe, but low performance
    /*public static synchronized  SingletonDemo getInstance() {
        if(null==instance)
            instance=new SingletonDemo();

        return instance;
    }*/

    //Double-Check locking
    public static SingletonDemo getInstance() {
        if (null == instance) {
            synchronized ((SingletonDemo.class)) {
                if (null == instance)
                    instance = new SingletonDemo();
            }
        }
        return instance;
    }
}
