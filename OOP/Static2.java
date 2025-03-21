class Delta
{
    static int num1;
    int num2;

    static
    {
        num1 = 4;
        System.out.println("Static Block");
    }

    {
        System.out.println("Non Static Block i.e. Java Block");
    }

    Delta()
    {
        num2 = 5;
        System.out.println("Delta Constructor");

    }

    static void Display()
    {
        System.out.println("Static Display Method");
//        System.out.println(num2);
        System.out.println(num1);
    }

    void Display1()
    {
        System.out.println("Non Static Display Method");
        System.out.println(num2);
        System.out.println(num1);
    }

}

public class Static2
{
    public static void main(String[] args)
    {
        System.out.println("Main Method");
//        Delta del = new Delta();
        Delta.Display();
//        del.Display1();
    }
}
