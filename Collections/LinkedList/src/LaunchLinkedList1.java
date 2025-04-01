import java.util.LinkedList;
import java.util.List;

public class LaunchLinkedList1
{
    public static void main(String[] args)
    {
        LinkedList lList = new LinkedList();
        lList.add(34);
        lList.add("Om");
        lList.add(true);

        System.out.println(lList);

        LinkedList lList1 = new LinkedList();
        lList1.addLast(30);
        lList1.addFirst(null);
        lList1.addLast(30);

        System.out.println(lList1);

        lList1.add(lList);
        System.out.println(lList1);

    }
}