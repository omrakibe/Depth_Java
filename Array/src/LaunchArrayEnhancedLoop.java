import java.util.Arrays;

public class LaunchArrayEnhancedLoop
{
    public static void main(String[] args)
    {
        float[] arr = {0, 8, 6, 1, 2, 7, 3, 4};
//        for (float elem : arr) {
//            System.out.print(elem + " ");
//        }

        System.out.println();

        Arrays.sort(arr);

        for (float elem : arr)
        {
            System.out.print(elem + " ");
        }

        System.out.println();

        int[][] arr1 = {{2, 3, 4}, {5, 6, 7}};
        System.out.println("Array length: " + arr1.length);

        double[] arr3 = new double[]{2.4, 4.5, 5.9, 6.5};

        for (double elem : arr3)
        {
            System.out.println(elem);
        }

        for (int[] row : arr1)
        {
            for (int elem : row)
            {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

        System.out.println(arr1.getClass().getName());
        System.out.println(arr3.getClass().getName());
    }
}
