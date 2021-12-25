public class java2s {
   /* private int i = 1;
    public static void main(String argv[]){
        int i = 2;
        java2s s = new java2s ();
        s.someMethod();
    }
    public static void someMethod(){
        System.out.println(i);
    }*/

    /*public int i;
    public static void main(String argv[]){
        java2s sc = new java2s();
        // Comment line
        System.out.println((new java2s()).i);
        System.out.println(sc.i);
    }*/

   /* int i;
    int j;
    for(i=1;i<4;i++) {
        for (j=2; j < 4; j++) {
            if (j == 3) {
                continue;
            }
            System.out.println("i: " + i + " j: " + j);
        }
    }*/

    public static void main(String args[]) {
        String s1 = new String("Java");
        String s2 = new String("Java");
        String s3 = "Java";
        String s4 = "Java";
        do
            System.out.println(s1.equals(s2));
        while (s3 == s4);
    }


}
