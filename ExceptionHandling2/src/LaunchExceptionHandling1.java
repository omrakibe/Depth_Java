import java.util.Scanner;

class Division
{

    public void div()
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Numerator: ");
        int num = scan.nextInt();

        System.out.print("Enter Dinomerator: ");
        int deno = scan.nextInt();

        float res = num / deno;
        System.out.println("Result is: " + res);
    }
}


public class LaunchExceptionHandling1
{
    public static void main(String[] args)
    {
        System.out.println("Maths application started:");

        Division div = new Division();
        try
        {
            div.div();
        } catch (ArithmeticException e)
        {
            System.out.println("Enter non zero numbers.");
        }
        System.out.println("Maths application ended smoothly");
    }
}
