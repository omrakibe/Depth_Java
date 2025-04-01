import java.util.Scanner;

class AgeLimitException extends Exception
{
    public AgeLimitException(String msg)
    {
        super(msg);
    }
}

class Applicant
{
    Scanner scan = new Scanner(System.in);

    int age;

    public void input()
    {

        System.out.print("Kindly Enter your Age: ");
        age = scan.nextInt();
    }

    public void verify() throws AgeLimitException
    {
        if (age > 18 && age <= 60)
        {
            System.out.println("Eligible, proceed further application!!");
        } else
        {
            AgeLimitException ale = new AgeLimitException("Not Eligible!! Age should be greater then 18 and less then equal to 60");
            System.out.println(ale.getMessage());
            throw ale;
        }
    }
}


public class LaunchLiscence
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Vahan Portal");
        Applicant app = new Applicant();

        try
        {
            app.input();
            app.verify();
        } catch (AgeLimitException ale)
        {
            try
            {
                app.input();
                app.verify();
            } catch (AgeLimitException ae)
            {
                try
                {
                    app.input();
                    app.verify();
                } catch (AgeLimitException al)
                {
                    System.out.println("Sorry, Attempts come to end of Limits!!");
                }
            }
        }
    }
}
