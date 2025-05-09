public class ThreadExample {
    public static void main(String []args) {
        Runnable r = () -> {
            System.out.print("Java Thread");
        };

        Thread t = new Thread(r);
        t.start();
    }

}
