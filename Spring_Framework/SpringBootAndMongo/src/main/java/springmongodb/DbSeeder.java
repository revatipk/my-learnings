package springmongodb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner {

    private EmployeeRepository employeeRepository;

    public DbSeeder(EmployeeRepository repo)
    {
        this.employeeRepository = repo;
    }
    @Override
    public void run(String... args) throws Exception {
        Employee mitali = new Employee(
                "Mitali",
                "Specialist",
                new Organization("Microsoft","Bangalore")
        );
        Employee siri = new Employee(
                "Siri",
                "Manager",
                new Organization("HPE","Bangalore")
        );
        Employee saachi = new Employee(
                "Saachi",
                "Programmer",
                new Organization("Microfocus","Bangalore")
        );

         this.employeeRepository.deleteAll();

        List<Employee> employees = Arrays.asList(mitali,siri,saachi);
        this.employeeRepository.save(employees);
    }
}
