import java.sql.DatabaseMetaData;
import java.util.stream.IntStream;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        long start=0, end=0;
        start = System.currentTimeMillis();
        IntStream.range(1,100).forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Time take for Plain Stream : "+(end-start));

        start = System.currentTimeMillis();
        System.out.println("------------------------------------------");
        IntStream.range(1,100).parallel().forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Time take for Parallel Stream : "+(end-start));
        System.out.println("------------------------------------------");
        System.out.println("Plain Stream : ");
        IntStream.range(1,10).forEach(x->{System.out.println(Thread.currentThread().getName());});

        System.out.println("------------------------------------------");
        System.out.println("Parallel Stream : ");
        IntStream.range(1,10).parallel().forEach(x->{System.out.println(Thread.currentThread().getName());});
        start = System.currentTimeMillis();
        System.out.println("------------------------------------------");
        double average1=EmployeeDatabase.getEmployees().stream().map(Employee::getSalary).mapToInt(i->i).average().getAsDouble();
        end = System.currentTimeMillis();
        System.out.println("Time take for Plain Stream : "+(end-start));

        System.out.println("Average with plain stream : "+average1);
        start = System.currentTimeMillis();
        System.out.println("------------------------------------------");
        double average2=EmployeeDatabase.getEmployees().parallelStream().map(Employee::getSalary).mapToInt(i->i).average().getAsDouble();
        end = System.currentTimeMillis();
        System.out.println("Time take for Parallel Stream : "+(end-start));
        System.out.println("Average with parallel stream : "+average2);


    }
}
