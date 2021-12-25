/*
package Lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PersonTestJava8{
    public static void main(String[] args) {
        List people = new ArrayList<Person>();
        people.add(new Person("Shilpa", "Patil", 39));
        people.add(new Person("Siri", "Patil", 39));
        people.add(new Person("Saachi", "Patil", 39));
        people.add(new Person("Revati", "Kamannavar", 39));
        people.add(new Person("Mitali", "Udapudi", 39));
        people.add(new Person("Papanna", "Kamannavar", 39));
        people.add(new Person("Prema", "Kamannavar", 39));
        people.add(new Person("Chhaya", "Singh", 39));

        Collections.sort(people, (Person o1, Person o2) -> o1.getFirstName().compareTo(o2.getFirstName()));
        printConditionally(people, p -> true,p->System.out.println(p.getFirstName()));

        printConditionally(people,  p -> p.getLastName().startsWith("K"),p->{System.out.println(p);});
    }
        public static void printConditionally(List<Person> ppl, Predicate<Person> cond, Consumer<Person> consumer){
            for(Person p:ppl)
            {
                if(cond.test(p)){
                    consumer.accept(p);
                }
            }
            ppl.forEach(p->System.out.println(p));
            ppl.forEach(System.out::println); //Method reference
        }

}*/
