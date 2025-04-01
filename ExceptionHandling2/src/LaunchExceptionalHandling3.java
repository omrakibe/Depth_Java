import java.util.Scanner;

class Exp1
{
    void div() throws ArithmeticException
    {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        int deno = 0;

        try
        {


            System.out.print("Enter Numerator: ");
            num = scan.nextInt();

            System.out.print("Enter Dinomerator: ");
            deno = scan.nextInt();

            float res = num / deno;
            System.out.println("Result is: " + res);
        } catch (ArithmeticException e)
        {
            System.out.println("Enter Non zero Numbers.");
            deno = scan.nextInt();
            float res = num / deno;
            System.out.println("Result is: " + res);
//            throw e;

        } finally
        {
            System.out.println("om Rakibe");
//            Number();
        }

        System.out.println("Hello World");
    }

    int Number()
    {
        try
        {
            return 4;
        } finally
        {
            System.out.println("finally block after return");
        }
    }
}

public class LaunchExceptionalHandling3
{
    public static void main(String[] args)
    {
        System.out.println("Maths application started:");

        Exp1 div = new Exp1();

        try
        {
            div.div();
        } catch (Exception e)
        {
            System.out.println("Invalid Input");
        }

        System.out.println("Maths application ended smoothly");
    }
}
