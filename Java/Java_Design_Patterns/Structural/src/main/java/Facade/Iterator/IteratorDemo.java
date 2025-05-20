package Facade.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        NameList names= new NameList();
        Iterator iterator = names.getIterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
