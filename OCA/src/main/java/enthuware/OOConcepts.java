package enthuware;

import java.util.ArrayList;

public class OOConcepts {
    //1
    /*public static void main(String args[]) {
        byte starting = 3;
        short firstValue = 5;
        int secondValue = 7;
        int functionValue = (int) (starting / 2 + firstValue / 2 + (int) firstValue / 3) + secondValue / 2;
        System.out.println(functionValue);


    }*/

    //2
    /*char c;
    public void m1(){
        char[ ] cA = { 'a' , 'b'};
        m2(c, cA);
        System.out.println( ( (int)c)  + "," + cA[1] );
    }
    public void m2(char c, char[ ] cA){
        c = 'b';
        cA[1] = cA[0] = 'm';
    }
    public static void main(String args[]){
        new OOConcepts().m1();
    }*/

    //3
    /*public static void main(String args[]) {
        float f1 = -123;
        short s=12;
        long lg = 012;
//        float f2 = 2*0.15;
//        int i = (int) false;
        *//*int i =1_3;
        long y = 1_3;
        float z = 3.234_567f;*//*
        float test=12F;
        int k= 1+new Integer(2);
        int l = new Integer(1)+new Integer(3);
        Integer m=null;
        m=new Integer(1)+new Integer(3);
    }*/
    public static void testInts(Integer obj, int var){
        obj = var++;
        obj++;
    }
    public static void main(String[] args) {
        Integer val1 = new Integer(5);
        int val2 = 9;
        testInts(val1++, ++val2);
        System.out.println(val1 + " " + val2);

        boolean[] arryan = new boolean[10];

        if(false==false)
        {

        }
        if(true==false)
        {

        }
        String str[] =new String[5];
        String[][][] arr  ={{ { "a", "b" , "c"}, { "d", "e", null } },{ {"x"}, null },{{"y"}},{ { "z","p"}, {} }
        };
        System.out.println(arr[0][1][2]);


       /* int [] [] array = {{0}, {0, 1}, {0, 1, 2}, {0, 1, 2, 3}, {0, 1, 2, 3, 4}};
        int[] arr1 = array[4];
        System.out.println (arr1[4][1]);
        System.out.println (array[4][1]);*/

//        new Object[](new Object());
       /* new Object[]{ "aaa", new Object(), new ArrayList(), 10};
        new Object[]{ "aaa", new Object(), new ArrayList(), new String[]{""} };
        new Object[]{ "aaa", new Object(), new ArrayList(), {} };*/


    }

}
