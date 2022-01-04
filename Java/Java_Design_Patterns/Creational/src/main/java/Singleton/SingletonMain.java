public class SingletonMain {
    public static void main(String[] args) {
        SingletonDemo instance1 = SingletonDemo.getInstance();
        SingletonDemo instance2 = SingletonDemo.getInstance();
        System.out.println("Instance1 : "+instance1);
        System.out.println("Instance2 : "+instance2);
        /*Instance1 : SingletonDemo@483bf400
        Instance2 : SingletonDemo@483bf400*/



    }
}
