package Lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonTestJava7 {
    public static void main(String[] args)
    {
        List person = new ArrayList<Person>();
        person.add(new Person("Shilpa","Patil",39));
        person.add(new Person("Siri","Patil",39));
        person.add(new Person("Saachi","Patil",39));
        person.add(new Person("Revati","Kamannavar",39));
        person.add(new Person("Mitali","Udapudi",39));
        person.add(new Person("Papanna","Kamannavar",39));
        person.add(new Person("Prema","Kamannavar",39));
        person.add(new Person("Chhaya","Singh",39));

        person.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        printAll(person);

        printConditionally(person, new Condition(){

            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("K");
            }
        });
    }
    public static void printConditionally(List<Person> ppl, Condition cond){
        for(Person p:ppl)
        {
            if(cond.test(p)){
                System.out.println(p);
            }
        }
    }

        public static void printAll(List<Person> person){
        for(Person p:person)
            System.out.println(p);
    }
}

interface Condition{
    public boolean test(Person p);

}