package enthuware;

import java.util.ArrayList;
import java.util.List;

public class Widget {
    static int x = 5;
    public static void main(String []args){
        System.out.println("hello".concat(" world").trim().equals("hello world"));
        System.out.println("hello world".compareTo("Hello world") < 0);
        List al = new ArrayList();
        al.add(111); //2
        System.out.println(al.get(al.size()));  //3

       
            int x  = ( x=3 ) * 4;  // 1
            System.out.println(x);
        }
    }

