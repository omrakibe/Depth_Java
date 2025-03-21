class Students
{
    private String name;
    private int rollno;
    private float marks;

    public void setInfo(String name, int rollno, float marks)
    {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }
    public String getName()
    {
        return name;
    }

    public int getRollNo()
    {
        return rollno;
    }

    public float getMarks()
    {
        return marks;
    }
}

public class Encapsulation {
    public static void main (String [] args)
    {
        Students stu1 = new Students();
        stu1.setInfo("Om", 65, 7.73f);

        System.out.println("Name: " + stu1.getName());
        System.out.println("Roll no: " + stu1.getRollNo());
        System.out.println("Marks: " + stu1.getMarks());

    }
}
