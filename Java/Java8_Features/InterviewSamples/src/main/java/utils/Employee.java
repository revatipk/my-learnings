package utils;

public class Employee implements Comparable{
    int id;
    String name;
    int phone;
    int salary;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    int age;
    public Employee(int empid, String empName, int phoneNo, int sal, int age)
    {
        this.id=empid;
        this.name = empName;
        this.phone= phoneNo;
        this.salary=sal;
        this.age = age;
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

    @Override
    public int hashCode() {
       final int prime =  31;
       int result =1;
       result = prime*result+((name==null)?0:name.hashCode());
       return result;
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj==null){
            return false;
        }
        if(getClass()!=obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if(name==null) {
            if(other.name!=null)
                return false;
        } else if(!name.equals(other.name))
            return false;
        return true;
    }
}
