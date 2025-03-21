import java.util.Scanner;

public class Launch2DArray
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int [][]marks = new int[3][4];

        for(int i=0; i<marks.length; i++)
        {
            for(int j=0; j<marks[i].length; j++)
            {
                System.out.print("Class " + i + ". Student " + j + " :");
                marks[i][j] = scan.nextInt();
            }
        }

        for(int i=0; i< marks.length; i++)
        {
            for(int j=0; j<marks[i].length; j++)
            {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }


        //Jagged Array or 2D irregular array
        int [][]arr = new int[3][];
        arr[0]= new int[4];
        arr[1]= new int[2];
        arr[2]= new int[3];

        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.print("Class " + i + ". Student " + j + " :");
                marks[i][j] = scan.nextInt();
            }
        }

        for(int i=0; i< arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
