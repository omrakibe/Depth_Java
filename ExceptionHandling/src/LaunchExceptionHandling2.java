//import java.util.Scanner;
//
//public class LaunchExceptionHandling2
//{
//    public static void main(String[] args)
//    {
//        Scanner scan = new Scanner(System.in);
//
//        try {
//            System.out.println("Maths application started:");
//            System.out.print("Enter Numerator: ");
//            int num = scan.nextInt();
//
//            System.out.print("Enter Dinomerator: ");
//            int deno = scan.nextInt();
//
//            float res = num / deno;
//            System.out.println("Result is: " + res);
//
//        } catch (ArithmeticException e) {
//            System.out.println("Enter non zero numbers.");
//        }
//
//        try {
//            System.out.println("Enter the size of an Array: ");
//            int sizeArr = scan.nextInt();
//
//            int[] arr = new int[sizeArr];
//
//            System.out.println("Enter the elements to be added in an array: ");
//            int data = scan.nextInt();
//
//            System.out.println("Enter the index at which element to be added:");
//            int index = scan.nextInt();
//
//            arr[index] = data;
//            System.out.println("Data added successfully");
//        } catch (NegativeArraySizeException e)
//        {
//            System.out.println("Enter positive numbers.");
//        } catch (ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println("Please be in yours Limits.");
////        } catch (Exception e) {
////            System.out.println("Invalid Data");
////        }
//
//
//        System.out.println("Maths application ended smoothly");
//    }
//}
