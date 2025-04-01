import java.util.Scanner;
import java.util.SortedMap;

class InvalidCredentialException extends Exception
{
    public InvalidCredentialException(String msg)
    {
        super(msg);
    }
}

class ATM
{
    Scanner scan = new Scanner(System.in);

    int accNo = 2222;
    int password = 6000;
    int withDraw;
    int res;

    protected int verifyUser() throws InvalidCredentialException
    {
        System.out.print("Enter your Account Number: ");
        int inpAcc = scan.nextInt();

        if (accNo == inpAcc)
        {

            System.out.print("Enter your Password: ");
            int inpPass = scan.nextInt();

            if (password == inpPass)
            {
                return accNo;

            } else
            {
                InvalidCredentialException exc = new InvalidCredentialException("Invalid Password");
                System.out.println(exc.getMessage());
                throw exc;

            }

        } else
        {
            InvalidCredentialException exc = new InvalidCredentialException("Account Number is not registered");
            System.out.println(exc.getMessage());
            throw exc;
        }
    }

    protected void withDraw()
    {
        try
        {
            res = verifyUser();
        } catch (InvalidCredentialException exc)
        {
            try
            {
                res = verifyUser();
            } catch (InvalidCredentialException ex)
            {
                try
                {
                    res = verifyUser();
                } catch (InvalidCredentialException ec)
                {
                    System.out.println("Attempts come to an end!!");
                }
            }
        }

//        if (res == -1)
//        {
//            System.out.println("Credential was incorrect");
//
//        } else if (res == accNo)
//        {
//            System.out.println("Enter Amount to Withdraw: ");
//            withDraw = scan.nextInt();
//            System.out.println("Account " + res + " has withdrawn: " + withDraw + "$");
//        }
    }


}

public class LaunchATMManage
{
    public static void main(String[] args)
    {
        ATM atm = new ATM();
//        atm.verifyUser();
        atm.withDraw();
    }
}
