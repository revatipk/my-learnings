package springmongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Employees")
public class Employee {
    @Id
    private String employeeId;
    private String name;
    @Indexed(direction = IndexDirection.ASCENDING)
    private String title;
    private Organization org;

    public Employee(String empName,String jobTitle, Organization org)
    {
//        this.employeeId = empId;
        this.name = empName;
        this.title = jobTitle;
        this.org = org;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public Organization getOrg() {
        return org;
    }

}
