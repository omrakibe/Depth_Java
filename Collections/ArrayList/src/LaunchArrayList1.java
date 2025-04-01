import java.util.ArrayList;

public class LaunchArrayList1
{
    public static void main(String[] args)
    {
        ArrayList aList = new ArrayList();

        aList.add(65);
        aList.add("Om Rakibe");
        aList.add(true);

        System.out.println(aList);

        ArrayList aList1 = new ArrayList();

        aList1.add(65);
        aList1.add(68);
        aList1.add(71);

        System.out.println(aList1);

        aList.addAll(aList1);
        System.out.println(aList);

        aList.add(2, false);
        System.out.println(aList);

    }
}