class Exception {
    void alien() {
        System.out.println("Hello ");
        alien();
    }
}

public class LaunchExceptionHandling3
{
    public static void main(String[] args)
    {
        Exception exp = new Exception();
        exp.alien();
    }
}
