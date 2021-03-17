package springmongodb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employess")
public class EmployeeController {
    private  EmployeeRepository repo;
    public EmployeeController(EmployeeRepository employeeRepository)
    {
        this.repo = employeeRepository;
    }

    @GetMapping("/all")
    public List<Employee> getAll()
    {
        List employees = repo.findAll();
        return  employees;


    }
}
