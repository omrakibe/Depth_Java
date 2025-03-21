class Student
{
    int id;
    void display()
    {
        id=4;
        System.out.println("Id: " + id);
    }
}

public class OOP
{
    public static void main(String[] args)
    {
        Student stu1 = new Student();
        stu1.display();
    }
}
