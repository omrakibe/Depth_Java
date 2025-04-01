abstract class Cars
{
    public abstract void engine();
    final int a = 10;
}

class Ford extends Cars
{
    public final void engine()
    {
        System.out.println("1899cc engine");
    }
}

class BMW extends Cars
{
    public void engine()
    {
        System.out.println("2299cc Engine");
    }
}

public class LaunchAbstract
{
    static public void main(String[] args)
    {
        Ford ford = new Ford();
        ford.engine();
    }
}