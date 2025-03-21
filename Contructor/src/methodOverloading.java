class Overloading
{
    public void add(int a, int b)
    {
        System.out.println(a+b);
    }

    public float add(int a, float b)
    {
        return a+b;
    }
}

public class methodOverloading {
    public static void main(String[] args)
    {
        Overloading sum = new Overloading();
        sum.add(1, 2);
        float res = sum.add(2, 3.4f);
        System.out.println(res);
    }
}
