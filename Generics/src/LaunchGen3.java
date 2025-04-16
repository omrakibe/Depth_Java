import java.util.ArrayList;
import java.util.List;

class Humans
{
    int age;

    public void disp()
    {
        System.out.println("Humans are creatures");
    }
}

class Student extends Humans
{

}

class Employee
{

}

public class LaunchGen3
{
    public static void main(String[] args)
    {
        //wild card
        Object obj = new Object();
        Humans hum = new Humans();

        obj = hum; //upcasting

        Student std = new Student();
        hum = std; //upcasting comes to picture

//        std = hum //leads to error, downcasting

//        ArrayList<Humans> humList1 = new ArrayList<>();
//        ArrayList <Student> stuList2 = new ArrayList<>();

//        humList1 = stuList2; //throwing compile error

        //Wild Card
        ArrayList<?> humList1 = new ArrayList<>();  //Wild card
        ArrayList<Student> stdList1 = new ArrayList<>();
        ArrayList<Employee> empList1 = new ArrayList<>();

        humList1 = stdList1;
        humList1 = empList1;

        //UpperBound
        ArrayList<? extends Humans> humList2 = new ArrayList<>();
        ArrayList<Student> stdList2 = new ArrayList<>();
        ArrayList<Employee> empList2 = new ArrayList<>();

        humList2 = stdList2; //UpperBound
//        humList2 = empList2; // error

        //lowerBound
        ArrayList<Humans> humList3 = new ArrayList<>();
        ArrayList<? super Student> stdList3 = new ArrayList<>();

        stdList3 = humList3; //lowerbound

        ArrayList<? super Humans> humList4 = new ArrayList<>();
        ArrayList<Object> objList = new ArrayList<>();
        humList4 = objList;

        ArrayList<Humans> alist = new ArrayList<>();
        alist.add(new Humans());
        om(alist);

        empList2.add(new Employee());
//        om(empList2);   //error, employee is not child of humans class

    }

    public static void om(List<? extends Humans> list)
    {
        for (Humans hum : list)
        {
            System.out.println(hum);
        }
    }
}
