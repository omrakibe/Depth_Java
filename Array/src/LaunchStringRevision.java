import java.util.Scanner;

class EnhancedArray
{
    Scanner scan = new Scanner(System.in);
    int[][] arr1;

    void sizeOfArray()
    {
        System.out.println("Enter the size of an array: ");
        int size = scan.nextInt();
        arr1 = new int[size][size];
    }

    EnhancedArray()
    {
        sizeOfArray();
        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr1.length; j++)
            {
                System.out.print("Enter " + i + "," + j + " Element:");
                arr1[i][j] = scan.nextInt();
                System.out.println();
            }
        }

        for (int[] row : arr1)
        {
            for (int elem : row)
            {
                System.out.print(elem + "  ");
            }
            System.out.println();
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
