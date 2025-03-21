public class Static
{
    static int num1;

    static
    {
        System.out.println("Static Block");
    }
    public static void main(String[] args)
    {
        num1 = 4;
        System.out.println("main method");
    }
}
