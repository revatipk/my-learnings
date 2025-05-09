package java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class MethodReferenceDemo {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Shilpa", 40));
        personList.add(new Person("Revati", 39));
        personList.add(new Person("Mitali", 12));
        personList.add(new Person("Saachi", 6));

        ComparisonProvider comparisonProvider = new ComparisonProvider();
        Collections.sort(personList,comparisonProvider::compareByName);
        System.out.println("Sort by Name");
        personList.stream().map(x->x.getName()).forEach(System.out::println);
        personList.stream().forEach(System.out::println);
    }
}
    class Person{
        private String name;
        private Integer age;
        public Person(String name, int age)
        {
            this.name = name;
            this.age = age;
        }
        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }
    }
    class ComparisonProvider
    {
        public int compareByName(Person a, Person b)
        {
            return a.getName().compareTo(b.getName());
        }
        public int compareByAge(Person a, Person b)
        {
            return a.getAge().compareTo(b.getAge());
        }
    }
