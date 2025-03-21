import java.util.Scanner;

public class Launch3DArray
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        int [][][]arr = new int[2][2][4];

        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                for(int k=0; k<arr[i][j].length; k++)
                {
                    System.out.println("School " + i + ", class " + j + ", student: " + k);
                    arr[i][j][k] = scan.nextInt();
                }
            }
        }

        for (int[][] ints : arr) {
            for (int j = 0; j < ints.length; j++) {
                for (int k = 0; k < ints[j].length; k++) {
                    System.out.print(ints[j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
