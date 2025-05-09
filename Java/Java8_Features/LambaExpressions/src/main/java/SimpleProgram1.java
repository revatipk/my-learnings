import java.util.ArrayList;

// A Java program to demonstrate simple lambda expressions
public class SimpleProgram1 {
    public static void main(String []args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(23);
        list.add(15);
        list.add(56);
        list.add(100);
        list.stream().forEach(System.out::println);
        System.out.println("Sorted Ascending..");
        list.stream().sorted().forEach(System.out::println);
        System.out.println("Sorted Descending..");
        list.stream().sorted((o1, o2) -> o2.compareTo(o1)).forEach(System.out::println);
        System.out.println("Even numbers..");
        list.stream().filter(i->i%2==0).forEach(System.out::println);
        System.out.println("Odd numbers..");
        list.stream().filter(i->!(i%2==0)).forEach(System.out::println);
    }
}
