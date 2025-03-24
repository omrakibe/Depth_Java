@FunctionalInterface //meta data: annotation gives info for compiler and developer too.
interface IKJEI
{
    //with single abstract method interface is called functional interface.
    void disp();

    default void hello()
    {
        System.out.println("Hello World");
    }
}
//option 1
//class Trinity implements IKJEI
//{
//    @Override
//    public void disp()
//    {
//        System.out.println("Trinity academy");
//    }
//}

public class LaunchLambda1
{
    public static void main(String[] args)
    {
        //option 2
        //Annonymous inner class
//        IKJEI kj = new IKJEI()
//        {
//            @Override
//            public void disp()
//            {
//                System.out.println("Hello world");
//            }
//        };
//        kj.disp();
//        Trinity tr = new Trinity();
//        tr.disp();

        //option 3
        IKJEI kj = () -> System.out.println("Hello Om!");

        kj.disp();
    }
}
