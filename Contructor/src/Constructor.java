class Books
{
    private String bookName;
    private double cost;

    public String getBookName() {
        return bookName;
    }

    public double getCost() {
        return cost;
    }

    Books(String bookName, double cost)
    {
        this();
        this.bookName = bookName;
        this.cost = cost;
    }
    Books()
    {
        this(2);
        System.out.println("Zero Parametrized Constructor");
    }
    Books(int a)
    {
        System.out.println("one Parametrized Constructor2");
    }
}

public class Constructor
{
    public static void main (String[] args)
    {
        student stu1 = new student("Om", 45);
        System.out.println(stu1.getName());
        student stu2 = new student();

        System.out.println("***********************************");

        Books book1 = new Books("Om Rakibe", 499.99);
        System.out.println("Book Name: " + book1.getBookName());
        System.out.println("Cost: " + book1.getCost());
    }
}

class student
{
    private int id;
    private String name;

    student(String name, int id)
    {
        this.id = id;
        this.name = name;
    }
    student() {
        System.out.println("Hello World");
    }
    public String getName()
    {
        return name;
    }
}