package java8.streams;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDemo {
    public static void main(String [] args)
    {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Sakshi",23));
        employees.add(new Employee("Asha",34));
        employees.add(new Employee("Lakshmi",87));
        employees.add(new Employee("Santhosh",98));

        employees.stream().filter(e->e.getName().startsWith("S")).forEach(e-> System.out.println(e.getName()));
        employees.stream().sorted((e1,e2)->e1.name.compareTo(e2.name)).forEach(x-> System.out.println(x.name));
    }
}
