import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;

public class LaunchIterator1
{
    public static void main(String[] args)
    {
        LinkedList lList = new LinkedList();

        lList.add(30);
        lList.add(30);
        lList.add(200);
        lList.add(300);
        lList.add(400);
        lList.add(500);

        System.out.println(lList);

//        for(Object o: lList)
//        {
//            System.out.println(o);
//        }
        Iterator itr = lList.iterator();
        //        System.out.println(itr.hasNext());
//        System.out.println(itr.next());

//        for(int i=0; i<lList.size(); i++)
//        {
//            System.out.println(lList.get(i));
//            lList.add(30);
//        }

        try
        {
            for (Object o : lList)
            {
                System.out.println(o);
                lList.add(33);
            }
        } catch (ConcurrentModificationException e)
        {
            System.out.println("Warning!!, Iteration is not getting stop.");
        }

        while (itr.hasNext())
        {
            System.out.println(itr.next());
            lList.add(89);
        }
    }
}
