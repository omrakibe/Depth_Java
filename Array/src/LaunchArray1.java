import java.util.Scanner;

public class LaunchArray1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int []arr = new int[4];

//     for(int i=0; i<arr.length; i++)
//     {
//         System.out.print("Enter the Marks of the Students " + i + " : ");
//         arr[i] = scan.nextInt();
//     }

        for (int j : arr) {
            System.out.println(j);
        }
    }
}
