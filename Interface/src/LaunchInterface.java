interface ICalc
{
    public abstract void sub();
    void add();
}

class MyCalc implements ICalc
{
    public void add()
    {
        System.out.println("Add method");
    }

    public void sub()
    {
        System.out.println("Sub method");
    }
}
public class LaunchInterface
{
    static public void main(String[] args)
    {
        MyCalc calc = new MyCalc();
        calc.add();
        calc.sub();
    }
}
