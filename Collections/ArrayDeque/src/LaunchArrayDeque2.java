import java.util.ArrayDeque;

class AddQue {
    ArrayDeque aDeque1 = new ArrayDeque();

    public AddQue(String msg) throws NullPointerException
    {
        aDeque1.add(4);

        try
        {
            aDeque1.add(null);
        } catch(NullPointerException e)
        {
            System.out.println(msg);
            throw e;
        } finally
        {
            System.out.println(aDeque1);
        }

    }
}

public class LaunchArrayDeque2
{
    public static void main(String[] args)
    {
//        ArrayDeque aDeque = new ArrayDeque();
//        aDeque.add(2);
//        aDeque.add(4);
//        aDeque.add(5);
//        aDeque.add(6);
//
//        try
//        {
//            aDeque.add(null);
//        } catch (NullPointerException e) {
//            System.out.println("Null value is not allowed in ArrayDeque");
//        }
//        System.out.println(aDeque);


        try
        {
            AddQue aq = new AddQue("Null value is not allowed in ArrayDeque");
        } catch (NullPointerException e) {
            System.out.println("Null is not valid");
        }

    }
}