import java.util.Scanner;


class UnderAgeException extends Exception
{
    public UnderAgeException(String msg)
    {
        super(msg);
    }
}

class OverAgeException extends Exception
{
    public OverAgeException(String msg)
    {
        super(msg);
    }
}

class LicenseApplicant
{
    Scanner scan = new Scanner(System.in);

    int age;

    public void input()
    {
        System.out.print("Kindly Enter your Age: ");
        age = scan.nextInt();
    }

    public void verify() throws UnderAgeException, OverAgeException
    {
        input();
        if (age < 18)
        {
            UnderAgeException uae = new UnderAgeException("Your too younger to drive Vehicle, have Patience");
            System.out.println(uae.getMessage());
            throw uae;
        } else if (age >= 60)
        {
            OverAgeException oae = new OverAgeException("Your age is out of Limits of Rules!!");
            System.out.println(oae.getMessage());
            throw oae;
        } else
        {
            System.out.println("Eligible for Driving License!!");
        }
    }
}

public class LaunchLicense1
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to India Vahan Portal");
        LicenseApplicant la = new LicenseApplicant();
        try
        {
            la.verify();
        } catch (UnderAgeException | OverAgeException uoe)
        {
            try
            {
                la.verify();
            } catch (UnderAgeException | OverAgeException ue)
            {
                try
                {
                    la.verify();
                } catch (UnderAgeException | OverAgeException oe)
                {
                    System.out.println("Limits of attends cross, try after 30 minutes.");
                }
            }
        }
    }
}
