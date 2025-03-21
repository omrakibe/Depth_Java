import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        System.out.println("Enter Number: ");

        Scanner scan = new Scanner(System.in);
        double n1 = scan.nextDouble();        //Input from user

        System.out.println("Number is: " + (n1+5678.678));
    }
}
