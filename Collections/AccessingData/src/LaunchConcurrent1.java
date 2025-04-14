import java.util.concurrent.CopyOnWriteArrayList;

public class LaunchConcurrent1
{
    public static void main(String[] args)
    {
        CopyOnWriteArrayList cArrayList = new CopyOnWriteArrayList();
        cArrayList.add(30);
        cArrayList.add(30);
        cArrayList.add(200);
        cArrayList.add(300);
        cArrayList.add(400);
        cArrayList.add(500);

        System.out.println(cArrayList);

//        for (int i = 0; i < cArrayList.size(); i++)
//        {
//            System.out.println(cArrayList.get(i));
//            cArrayList.add(44);
//        }

        for (Object o : cArrayList)
        {
            System.out.println(o);
            cArrayList.add(44);
        }
    }
}
