package enthuware.Inheritance;
/*public class TestClass{
    public TestClass(int a, int b) { } // 1
    public void TestClass(int a) { }   // 2
//    public TestClass(String s); // 3
    private TestClass(String s, int a) { }     //4
    public TestClass(String s1, String s2) { }; //5
}*/

import java.time.LocalDate;
import java.util.function.Predicate;

class Data {
    int x = 0, y = 0;
    public Data(int x, int y){
        this.x = x; this.y = y;
    }
}
public class TestClass {

    public static void main(String[] args) throws Exception {

        //
        /*boolean b1 = false;
        boolean b2 = false;
        if (b2 != b1 = !b2)
        {

        }*/
        Object t = new Integer(107);
        int k = ((Integer) t).intValue()/9;
        System.out.println(k);
        //
        String str1 = "one";
        String str2 = "two";
        System.out.println( str1.equals(str1=str2) );
        //
       /* int i, j, k;
        i = j = k = 9;
        System.out.println(i);*/
        char ch = 10;
        Boolean bool = false;
        Object o = new java.io.File("a.txt");
//        String[] sA = {new String( "aaa")};
//        String[] sA = { "aaa"};
//        String[] sA = new String[1] { "aaa"};
        byte b = -128 ;
        int i = b ;
        b = (byte) i;
        System.out.println(i+" "+b);
        float fl = 123123f;

        Data d = new Data(1, 1);
        d.x=2;
        //2
        new TestClass();

        //3
       /* int i = 1234567890;
        float f = i;
        System.out.println(i - (int)f);*/

        try{

        System.exit(0);
        }finally{
            System.out.print("asdasd");
        }

    }
    static int si = 10;



    public TestClass(){
        System.out.println(this);
    }
    public String toString(){
        return "TestClass.si = "+this.si;
    }
    public float setVar(int a) {
        return a;
    }
    /*public int setVar(int a, int b, float c) {return a;  }
    public int setVar(int a, float b, int c) {
        return this(a, c, b);
    }*/
}