import java.util.Scanner;

public class LaunchArrayByUserInput
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Size of Students: ");
        int n = scan.nextInt();

        int []hello = new int[n];

        for(int i=0; i<hello.length; i++)
        {
            System.out.print("Enter the RollNo of Student " + i + " : ");
            hello[i] = scan.nextInt();
        }

        for (int i: hello)
        {
            System.out.println(i);
        }
    }
}
