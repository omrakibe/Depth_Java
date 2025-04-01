public class LaunhWrapper
{
    public static void main(String[] args)
    {
         Integer i = Integer.valueOf(8);
        System.out.println(i);

        int n1 = 14;
        Integer n2= n1; //Autoboxing
        Integer n3 = Integer.valueOf(n1); //Boxing

        Integer x = Integer.valueOf(10);
        int z = x;//autoUnboxing
        int y = x.intValue(); //unboxing
        System.out.println(y);
        System.out.println(z);
    }
}