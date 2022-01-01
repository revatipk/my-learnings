import java.util.Collections;
import java.util.List;

public class SortingListUsingFunctionalInterface {
    public static void main(String []args){
        List<Employee> employees = EmployeeDatabase.getEmployees();

        /*Collections.sort(employees);
        System.out.print("Employees : "+employees);*/


        Collections.sort(employees,(e1, e2)->e2.salary-e1.salary);
        System.out.print("Employees Using Functional Interface: "+employees);
    }
}
