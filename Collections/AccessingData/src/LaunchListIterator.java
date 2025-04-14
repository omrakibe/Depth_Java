import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class LaunchListIterator
{
    public static void main(String[] args)
    {
        LinkedList lList = new LinkedList();
        lList.add(300);
        lList.add(80);
        lList.add(350);
        lList.add(100);

        System.out.println(lList);

        ListIterator lItr = lList.listIterator(lList.size());
        while (lItr.hasPrevious())
        {
            System.out.println(lItr.previous());
        }
    }
}
