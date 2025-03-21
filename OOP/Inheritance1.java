class Telusko
{
    void disp() {
        System.out.println("Telusko class");
    }
}

class Alien extends Telusko
{

}

public class Inheritance1
{
    public static void main (String[] args)
    {
        Alien al1 = new Alien();
        al1.disp();
    }
}