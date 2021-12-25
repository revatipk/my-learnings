public class TestClass{
    public static void main(String args[]){
        A[] a, a1;
        B[] b;
        a = new A[10]; a1  = a;
        b =  new B[20];
        a = b;  // 1
        b = (B[]) a;  // 2
//        b = (B[]) a1; // 3

        //
        int index = 1;
        String[] strArr = new String[5];
        String   myStr  = strArr[index];
        System.out.println(myStr);

        //
        boolean[] b1 = new boolean[2];
        boolean[] b2 = {true , false};
        System.out.println( "" + (b1[0] == b2[0]) + ", "+ (b1[1] == b2[1])  );
        //
        int i = 1;
        int[] iArr = {1};
        incr(i) ;
        incr(iArr) ;
        System.out.println( "i = " + i + "  iArr[0] = " + iArr [ 0 ] ) ;

        //
        if(true)
            if(false)
                System.out.println("True False");
            else
                System.out.println("True True");
        //
        int ia[][] = { {1, 2}, null };
        for (int ik = 0; ik < 2; ik++)
            for (int j = 0; j < 2; j++)
                System.out.println(ia[ik][j]);

    }
    public static void incr(int   n ) { n++ ; }
    public static void incr(int[ ] n ) { n [ 0 ]++ ; }

}
class A { }
class B extends A { }