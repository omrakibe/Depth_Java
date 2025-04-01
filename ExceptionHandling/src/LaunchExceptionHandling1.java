import java.util.Scanner;

public class LaunchExceptionHandling1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Maths application started:");

        try {
            System.out.print("Enter Numerator: ");
            int num = scan.nextInt();

            System.out.print("Enter Dinomerator: ");
            int deno = scan.nextInt();

            float res = num / deno;
            System.out.println("Result is: " + res);
        } catch (ArithmeticException e) {
            System.out.println("Do not enter zero");
        }

        System.out.println("Maths application ended smoothly");

    }
}