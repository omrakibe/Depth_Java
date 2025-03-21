@FunctionalInterface
interface ITelusko
{
    String disp();
}

@FunctionalInterface
interface IAdd
{
    void add(String a, double b);
}

interface INum
{
    void num(float b);
}

//class Alien implements ITelusko
//{
//    public void disp()
//    {
//        System.out.println("Im in sub implemeted class");
//    }
//}

public class LaunchLambda
{
    public static void main(String[] args)
    {
//        ITelusko tel = new ITelusko()
//        {
//            public void disp()
//            {
//                System.out.println("Inside annonymous Inner class");
//            }
//        };
//        tel.disp();

        //Lambda Exp
        IAdd add1 = (String x, double y) -> {
            System.out.println(x + y);
        };
        add1.add("Om", 9);


        //Lambda Expression
        IAdd add = (x, y) -> System.out.println(x + y);
        add.add("fe", 3);

        INum Num = x -> System.out.println(9);
        Num.num(3);

        ITelusko telusko = () -> {
            String a = "Hello world";
            return a;
        };
        String st = telusko.disp();
        System.out.println(st);
    }


}