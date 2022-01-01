public class Employee implements Comparable{
    int id;
    String name;
    int phone;
    int salary;
    public Employee(int empid, String empName, int phoneNo, int sal)
    {
        this.id=empid;
        this.name = empName;
        this.phone= phoneNo;
        this.salary=sal;
    }

    public Employee() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return " id="+this.id+" Name="+this.name+" Phone No:"+this.phone+" Sal: "+this.salary+"\t";
    }

    public int compareTo(Object o) {
        return this.salary - ((Employee)o).salary;
    }
}
