import java.util.Scanner;

class Farmer
{
    Scanner scan = new Scanner(System.in);

        float money;
        float time;
        float simpleInterest;

        static float rateOfInterest;

        static
        {
            rateOfInterest = 3.2f;
        }

        void input()
        {
            System.out.print("Enter the Amount of Loan: ");
            money = scan.nextFloat();
//            System.out.println();
            System.out.print("Enter the time (in Years) required to repay the Amount: ");
            time = scan.nextFloat();
        }

        void calculation()
        {
            simpleInterest = (money * time * rateOfInterest)/100f;
        }

        void display()
        {
            System.out.println("Simple Interest: " + simpleInterest);
            System.out.println("Need to pay after " + (int)time + " year amount: " + (simpleInterest + money));
        }
}

public class BankLoan
{
    public static void main(String [] args)
    {
        Farmer farmer1 = new Farmer();
        Farmer farmer2 = new Farmer();
        Farmer farmer3 = new Farmer();

        System.out.println("Farmer 1");
        farmer1.input();
        farmer1.calculation();
        farmer1.display();

        System.out.println("Farmer 2");
        farmer2.input();
        farmer2.calculation();
        farmer2.display();

        System.out.println("Farmer 3");
        farmer3.input();
        farmer3.calculation();
        farmer3.display();
//        System.out.println(farmer1.money);
    }
}
