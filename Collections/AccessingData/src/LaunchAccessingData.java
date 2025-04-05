import java.util.ArrayList;

public class LaunchAccessingData
{
    public static void main(String[] args)
    {
        ArrayList aList = new ArrayList();

        aList.add(30);
        aList.add(100);
        aList.add(200);
        aList.add(300);
        aList.add(400);
        aList.add(500);

        Integer a = (Integer) aList.get(2); //Down Casting
//        System.out.println(a);

//        for (Object o : aList)
//        {
//            a = (Integer) o;
//            System.out.println(a);
//        }

        for (int i=0; i< aList.size(); i++) {
            a = (Integer) aList.get(i);
            System.out.println(a);
        }
        System.out.println();
        System.out.println("Enhanced for Loop");

        for(Object obj : aList) {
            System.out.println(obj);
        }

    }
}