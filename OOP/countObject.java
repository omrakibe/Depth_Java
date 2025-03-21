class Allien
{
    int age;
    static int count;

    {
        count++;
    }
    Allien()
    {
        age = 19;
//        count++;
    }
    Allien(int age)
    {
        this.age =  age;
//        count++;
    }
}

public class countObject
{
    public static void main(String [] args)
    {
        Allien all = new Allien();
        System.out.println(Allien.count);
        Allien all1 = new Allien();
        Allien all2 = new Allien();
        System.out.println(Allien.count);
    }
}
