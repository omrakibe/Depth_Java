@FunctionalInterface
interface IAmazon
{
    //    void tester(int b);
    float developer(int a, float b);
}

public class LaunchLambda2
{
    public static void main(String[] args)
    {
//        IAmazon am = new IAmazon()
//        {
//            @Override
//            public void tester(int b)
//            {
//                System.out.println("Hello");
//            }
//        };
//        am.tester(10);

//        IAmazon induction = b ->
//        {
//            System.out.println("Price of Induction: " + b);
//        };
//        induction.tester(1299);

        IAmazon frontend = (int a, float b) ->
        {
            System.out.println("React is essential: " + (a + b));
            return a + b;
        };
        frontend.developer(2, 5);

    }
}
