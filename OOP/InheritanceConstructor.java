class Alpha1
{
    int a,b;
    Alpha1()
    {
        System.out.println("Zero param alpha const");
        a=10;
        b=20;
    }
    Alpha1(int m, int n)
    {
        System.out.println("Param alpha const");
        a = m;
        b = n;
    }
}
class Beta1 extends Alpha1
{
    int x, y;
    Beta1()
    {
        System.out.println("Zero param Beta Const");
        x = 4;
        y = 5;
    }
    Beta1(int m, int n)
    {
        System.out.println("Param beta const");
        x = m;
        y = n;
    }
    void disp()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);

    }
}

public class InheritanceConstructor
{
    public static void main(String[] args)
    {
        Beta1 beta = new Beta1();
        beta.disp();
    }
}
