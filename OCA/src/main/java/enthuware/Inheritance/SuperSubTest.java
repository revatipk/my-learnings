package enthuware.Inheritance;

//1
/*
class Super {
    static String ID = "QBANK";
}

class Sub extends Super{
    static { System.out.print("In Sub"); }
}
public class SuperSubTest{
    public static void main(String[] args){
        System.out.println(Sub.ID);
    }
}
*/

//2
/*
public class SuperSubTest{
    public static int[ ] getArray() {  return null;  }
    public static void main(String[] args){
        int index = 1;
        try{
            getArray()[index=2]++;
        }
        catch (Exception e){  }  //empty catch
        System.out.println("index = " + index);
    }
}
*/

//3
class Super {  }
class Sub extends Super {  }
public class SuperSubTest{
    public static void main(String[] args){
        Super s1 = new Super(); //1
        Sub s2 = new Sub();     //2
        s1 = (Super) s2;        //3
    }
}
