import java.util.Scanner;

class EnhancedArray
{
    Scanner scan = new Scanner(System.in);
    int[][] arr1;

    EnhancedArray()
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                assert false;
                arr1[i][j] = scan.nextInt();
            }
        }

        for (int[] row : arr1)
        {
            for (int elem : row)
            {
                System.out.println(elem);
            }
        }
    }
}

public class LaunchStringRevision
{
    public static void main(String[] args)
    {
        EnhancedArray ea = new EnhancedArray();
    }
}
