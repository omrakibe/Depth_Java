import java.util.Scanner;

class DonationLimitException extends Exception
{
    public DonationLimitException(String msg)
    {
        super(msg);
    }
}

class Donation
{
    Scanner scan = new Scanner(System.in);
    double amount;

    public void input()
    {
        System.out.print("Enter amount of Donation: ");
        amount = scan.nextDouble();
    }

    public void verify() throws DonationLimitException
    {
        if (amount <= 100)
        {
            input();
            DonationLimitException dle = new DonationLimitException("Please extended you amount!!");
            System.out.println(dle.getMessage());
            throw dle;
        } else
        {
            System.out.println("Thank you for helping needy ones!!");
        }
    }
}

public class LaunchCustomExceptionRevision
{
    public static void main(String[] args)
    {
        Donation d = new Donation();

        try
        {
            d.verify();
        } catch (DonationLimitException de)
        {
            try
            {
                d.verify();
            } catch (DonationLimitException e)
            {
                try
                {
                    d.verify();
                } catch (DonationLimitException ed)
                {
                    System.out.println("Too many Attempts, No need for your Money. Thank you so much!!");
                }
            }
        }
    }
}
