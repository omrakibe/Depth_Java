interface IKJ
{
    void disp();

    default byte num()
    {
        System.out.println("Hello num");
        return 0;
    }
}

public class LaunchLambdaRevision
{
    public static void main(String[] args)
    {
        IKJ kj = () -> System.out.println("Hello");
        kj.disp();
    }
}
