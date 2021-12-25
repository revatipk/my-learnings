public class Student
{
    private String name;
    private boolean passed;
    private int marks;

    public static void main(String[] args)
    {
        Student s = new Student();
        System.out.println(s.name+"..."+s.passed+"..."+s.marks);
    }
}