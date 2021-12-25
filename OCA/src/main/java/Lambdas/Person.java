package Lambdas;

public class Person {
    String firstName;
    String lastName;
    int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Person(String fn, String ln, int a)
    {
        this.firstName = fn;
        this.lastName = ln;
        this.age = a;
    }

    @Override
    public String toString() {
        return this.getFirstName()+" "+ this.getLastName()+" "+this.getAge();
    }
}
