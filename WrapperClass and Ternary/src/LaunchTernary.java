import java.util.Scanner;
public class LaunchTernary
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 3 numbers to compare : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int res = num1>num2 ? (num1>num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        System.out.println("Greater number is: " + res);
    }
}
