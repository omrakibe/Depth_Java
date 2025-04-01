import java.util.Scanner;

class Exp
{
    void div() throws ArithmeticException
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

public class LaunchExceptionalHandling2
{
    public static void main(String[] args)
    {
        System.out.println("Maths application started:");

        Exp div = new Exp();

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
