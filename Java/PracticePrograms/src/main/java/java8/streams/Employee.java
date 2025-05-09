package java8.streams;

public class Employee {
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    String name;
    int id;

    Employee(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

}
