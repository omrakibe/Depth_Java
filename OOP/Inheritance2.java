class Alpha
{
    Alpha()
    {
        System.out.println("Alpha Constructor");
    }
    void disp()
    {
        System.out.println("Hello Alpha");
    }
    void show()
    {
        System.out.println("SHow Method");
    }
}
class Beta extends Alpha
{
    Beta()
    {
        System.out.println("Beta Constructor");
    }

    void show()
    {
        System.out.println("Show method in Beta");
    }
    void beta()
    {
        System.out.println("beta method");
    }

}

public class Inheritance2
{
    public static void main(String[] args)
    {
        Alpha alp = new Beta();  //up casting
        alp.disp();
        alp.show();
//        alp.beta();
        ((Beta)alp).beta(); //down casting
    }

}
