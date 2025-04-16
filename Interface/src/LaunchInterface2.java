interface Telusko
{
    void show();
    default void disp()
    {
        System.out.println("default method");
    }
    static void course()
    {
        System.out.println("Java live course");
    }
}

interface Om1 extends Telusko {
    default void show() {
        System.out.println("Hii, this is Om1 interface");
    };
}

class Aleins implements Telusko
{
    public void show()
    {
        System.out.println("override show method");
    }

    @Override
    public void disp()
    {
//        System.out.println("override disp method");
    }
}

public class LaunchInterface2
{
    public static void main(String[] args)
    {
        Aleins aleins = new Aleins();
        aleins.show();
        aleins.disp();
        Telusko.course();
    }
}
