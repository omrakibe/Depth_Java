import java.util.Scanner;

class InvalidUserException extends Exception
{
    public InvalidUserException(String msg)
    {
        super(msg);
    }

}

class ATM1
{
    Scanner scan = new Scanner(System.in);
    int acc = 4444;
    int pass = 2000;

    int inpAcc;
    int inpPass;

    public void input()
    {
        System.out.print("Enter your acc number: ");
        inpAcc = scan.nextInt();
        System.out.print("Enter your password: ");
        inpPass = scan.nextInt();
    }

    public void verify() throws InvalidUserException
    {
        if (acc == inpAcc && pass == inpPass)
        {
            System.out.println("Good to see Agian!, Welcome you can withdraw Money");
        } else
        {

            InvalidUserException iue = new InvalidUserException("Sorry, incorrect Credentials");
            System.out.println(iue.getMessage());
            throw iue;
        }
    }
}

class Bank
{
    void initiate()
    {
        ATM1 atm = new ATM1();
        try
        {

            atm.input();
            atm.verify();
        } catch (InvalidUserException iue)
        {
            try
            {

                atm.input();
                atm.verify();
            } catch (InvalidUserException ie)
            {
                try
                {

                    atm.input();
                    atm.verify();
                } catch (InvalidUserException iu)
                {
                    System.out.println("Sorry, attempts are over!!!");
                }
            }
        }
    }
}

public class LaunchATMManage2
{
    public static void main(String[] args)
    {
        Bank bank = new Bank();
        bank.initiate();
    }
}
