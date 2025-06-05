interface IKJ
{
    void disp();

//    default byte num()
//    {
//        System.out.println("Hello num");
//        return 0;
//    }
}

interface IFlipkart
{
    int bonus(int price, int discount);
}

public class LaunchLambdaRevision
{
    public static void main(String[] args)
    {
        IKJ kj = () -> System.out.println("Hello");
        kj.disp();

        IFlipkart flipkart = Integer::sum;
        double value = flipkart.bonus(500, 100);
        System.out.println(value);
    }
}
