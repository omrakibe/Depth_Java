class Animal
{
    static int age;
    static void disp()
    {
        age = 44;
        System.out.println("Animal Static Method");
    }
    void show ()
    {
        System.out.println("Show Animal");
    }
}
class Deer extends Animal
{
    static void disp()
    {
        System.out.println("Deer static method");
    }

    @Override
    void show()
    {
        System.out.println("Show Deer");
    }
}

public class InheritanceStatic
{
    public static void main(String[] args)
    {
        Animal anim = new Deer();
        anim.disp();
        ((Deer)(anim)).disp();
    }
}
