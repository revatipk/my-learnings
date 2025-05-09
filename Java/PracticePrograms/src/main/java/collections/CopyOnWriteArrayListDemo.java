package collections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String []args)
    {
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<String>();
        Iterator iter = copyOnWriteArrayList.iterator();
        copyOnWriteArrayList.add("Hello");
        copyOnWriteArrayList.add("World");
//        Iterator iter = copyOnWriteArrayList.iterator();
        while(iter.hasNext())
        {
            System.out.print(iter.next()+" ");
        }

    }
}
