interface Hello <T>
{
    
}
class Generics <T> implements Hello <String>
{
    private T obj;
    public Generics(T obj)
    {
        this.obj = obj;
    }
    public void disp()
    {
        System.out.println(obj.getClass().getName());
    }
    public T getRef()
    {
        return obj;
    }
}

public class LaunchGen2 {
    public static void main(String [] args)
    {
        Generics<String> gen1 = new Generics<>("Om Rakibe");
        gen1.disp();
        System.out.println(gen1.getRef());

        Generics<Integer> gen2 = new Generics<>(65);
        gen2.disp();
        System.out.println(gen2.getRef());
    }
}
