/*
public class Test
{
    static int i =10;
    int j = 20;
    public void m1()
    {
        i++;
        j++;
    }
    public static void main(String[] args)
    {
        Test t1 = new Test();
        t1.m1();

        Test t2 = new Test();
        t2.m1();

        System.out.print(t2.i+" "+t2.j);
    }
}*/
/*
public class Test
{
    public static void main(String[] args)
    {
        int a =10;
        double b = 10.0;
        boolean c= true;
        System.out.println(++a + ++b + ++c);
    }
}
*/


/*public class Test
{
    float f= (float)10.5;
//    int i = 10.5;

    public static void main(String[] args)
    {
        char ch1 = 'a';
        char ch2 = 'b';
        System.out.println(ch1+ch2);
    }
}*/

/*
public class Test
{
    static int count;
    public void Test()
    {
        count=7;
    }
    public static void main(String[] args)
    {
//        int i;
        Test t = new Test();
        System.out.println(t.count);
//        System.out.println(i);
    }
}*/
/*public class Test
{
    public static void main(String... subjects)
    {
        System.out.println(subjects[0]);
    }
}*/


/*
class Demo
{
    String title ="Demo";
}
public class Test
{
    public static void m1(Demo d)
    {
        d.title = "NewDemo";
    }
    public static void main(String[] args)
    {
        Demo d =new Demo();
        m1(d);
        System.out.println(d.title);
    }
}*/
/*public class Test
{
    public static void main(String[] args)
    {
        int[] a = new int[3];
        a[0]=10;
        a[1]=10.0;
        System.out.println(a[0]+a[1]+a[2]);
    }
}*/
/*public class Test
{
    public static void main(String[] args)
    {
        int[] a = {10,20,30};
        int[] b = {10,20};
        a=b;
        for(int i :a)
        {
            System.out.print(i);
        }
    }
}*/

/*public class Test
{
    public static void m1(int x)
    {
        x=20;
    }
    public static void main(String[] args)
    {
        int x =10;
        m1(x);
        System.out.println(x);
    }
}*/
/*
public class Test
{
    public static void main(String[] args)
    {
        Boolean b1 = new Boolean(null);
        Boolean b2 = new Boolean(false);
        System.out.print((b1 == b2)+" ");
        System.out.print(b1.equals(b2));
    }
}*/

/*
public class Test
{
    public static void main(String[] args)
    {
        String[] argv = new String[2];
        argv=args;
        for(String v : argv)
        {
            System.out.print(v);
        }
    }
}*/
/*
public class Test
{
    public static void main(String[] args)
    {
        int x = 40;
        switch(x)
        {
            default :
                System.out.print("A");
            case 10:
                System.out.print("B");
                break;
            case 20:
                System.out.print("C");
            case 30:
                System.out.print("D");
        }
    }
}*/
/*
import java.util.*;
public class Test
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        for (Integer I : list)
        {
            System.out.println(I);
            break;
        }
    }
}*/
    /*
    public class Test
    {
        public static void main(String[] args)
        {
            int  x = 0;
            int y = 0;
            y = ++x;
            if(x)
            {
                System.out.println("Hello");
            }
            else
            {
                System.out.println("Hi");
            }
        }
    }*/
/*
public class Test
{
    public static void main(String[] args)
    {
        int x =10;
        int y =0;
        switch(x)
        {
            case 10:
                y++;
            case 20:
                y=y+2;
            case 30:
                y= y+3;
        }
        System.out.println(y);
    }
}*/
/*
public class Test
{
    public static void main(String[] args)
    {
        byte b = 10;
        switch(b)
        {
            case 10: System.out.print(10);
            case 100: System.out.print(100);
            case 1000: System.out.print(1000);
        }
    }
}*/
/*
public class Test
{
    public static void main(String[] args)
    {
        int[] x = new int[3];
        int y =0;
        for (int i =0; i>x.length; i++)
        {
            x[i]=++y;
        }
        for(int x1 : x)
        {
            System.out.print(x1);
        }
    }
}*/
/*public class Test
{
    public Test()
    {
        System.out.print("X");
    }
    public void Test()
    {
        System.out.print("Y");
    }
    public void m1()
    {
        new Test();
        Test();
    }
    public static void main(String[] args)
    {
        Test t = new Test();
        t.m1();
    }
}*/

/*
import java.sql.*;
import java.util.*;
public class Test
{
    public static void main(String[] args)
    {
        Date d = new Date();
        System.out.println(d);
    }
}*/
/*public class Test
{
    Test()
    {
        this(10);
        System.out.print(0);
    }
    Test(int i)
    {
        this(10.5);
        System.out.print(1);
    }
    Test(double i)
    {
        System.out.print(2);
    }
    public static void main(String[] args)
    {
        new Test(10);
    }
}*/
/*
public class Test
{
    public static void m1(int x)
    {
        System.out.print("int");
    }
    public static void m1(long l)
    {
        System.out.print("long");
    }
    public static void m1(float f)
    {
        System.out.print("float");
    }
    public static void m1(Object o)
    {
        System.out.print("Object");
    }
    public static void main(String[] args)
    {
        m1('a');
        m1(true);
        m1(10.5);
    }
}*/
/*
class Parent
{
    int x =10;
}
class Child extends Parent
{
    int x=20;
}
public class Test
{
    public static void main(String[] args)
    {
        Parent p = new Child();
        System.out.println(p.x);
    }
}
*/
/*class Parent
{
    public static void m1()
    {
        System.out.println("Parent Method");
    }
}
class Child extends Parent
{
    public static void m1()
    {
        System.out.println("Child Method");
    }
}
public class Test
{
    public static void main(String[] args)
    {
        Child c = new Child();
        ((Parent)c).m1();
    }
}*/
/*
public class Test
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println(10/0);
        }
        catch (ArithmeticException e)
        {
            System.out.println(10/0);
        }
        finally
        {
            String s = null;
            System.out.println(s.length());
        }
    }
}*/
/*
import java.util.Arrays;
import java.util.List;
public class Test
{
    public static void main(String[] args)
    {
        List<String> l = Arrays.asList("Cat","Dog");
        for(String s1 : l)
        {
            for (String s2: l  )
            {
                System.out.println(s1+"..."+s2);
            }
        }
    }
}*/
/*
public class Test
{
    public static void m1()
    {
        System.out.print("A");
        try
        {
            System.out.print("B");
            System.out.print(10/0);
        }
        catch (ArithmeticException e)
        {
            System.out.print("C");
        }
        finally
        {
            System.out.print("D");
        }
        System.out.print("E");
    }

    public static void main(String[] args)
    {
        m1();
        System.out.print("F");
    }
}*/
/*
public class Test
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println(10/0);
        }
        catch (Exception e)
        {
            System.out.println(10/0);
            System.out.println("catch");
        }
        finally
        {
            System.out.println("finally");
        }

    }
}*/
class TestException extends Exception
{
}
public class Test {
    public static void m1() throws Exception {
        System.out.print("A");
        throw new TestException();
    }

    public static void main(String[] args) {
   /* {
        try
        {
            m1();
        }
        catch (TestException e)
        {
            System.out.println("B");
        }
        finally
        {
            System.out.println("C");
        }*/


       /* int x = 100;
        int a = x++;
        int b = ++x;
        int c = x++;
        int d = a < b ? (a < c) ? a : (b < c) ? b : c : a;
        System.out.println(d);*/


       int x=6;
       Test test = new Test();
       test.doStuff(x);
       System.out.print("main "+x);
    }
    void doStuff(int x)
    {
        System.out.println("dostuff "+x++);
    }
}

