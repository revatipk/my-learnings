package enthuware.Inheritance;
import static java.lang.System.out;
class A{
    A() {  print();   }
    void print() { System.out.print("A "); }
}
class ClassB extends A{
    String s=this.toString();
//    String s1='as';
//    final int i =   4;//4,4

    /*int a, b, c;
    a=b=c=100;*/
//    int a = b = c = 100;
//    int a= 100 = b = c;


    int i =   4; // 0,4
    public static void main(String[] args){
        float f = 0.0f;
        System.out.print(f);
        A aa = new ClassB();
        aa.print();

        //
        /*Object t = new Integer(107);
        int k = (Integer) t.intValue()/9;
        System.out.println(k);*/
        //
        int[] a = { 1, 2, 3, 4 };
        int[] b = { 2, 3, 1, 0 };
        System.out.println( a [ (a = b)[3] ] );


        boolean b1 = false;
        boolean b2  = false;
        if (b2 = b1 != b2){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
       /* Object a, b, c ;
        a = new String("A");
        b = new String("B");
        c = a;
        a = b;
        System.out.println(""+c);*/
    }
    void print() { System.out.print(i+" "); }
}
