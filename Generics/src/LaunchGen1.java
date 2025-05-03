import java.util.ArrayList;

class SEB
{
    Integer rollNo;
    String name;
    Double marks;

    public SEB(Integer rollNo, String name, Double marks)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString()
    {
        return "SEB{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

public class LaunchGen1
{
    public static void main(String[] args)
    {
        //array follows type safety
        int[] arr = new int[4];
        arr[1] = 20;
        int data = arr[1];

        //collections  no type safety
        ArrayList aList1 = new ArrayList();
        aList1.add("Om");
        aList1.add("rakibe");
        aList1.add(65);

        String data1 = (String) aList1.getFirst();
        data1 = data1.toUpperCase();
        System.out.println(data1);

        String data2 = (String) aList1.get(1);
        data2 = data2.toUpperCase();
        System.out.println(data2);

//        String data3 = (String) aList1.getLast(); //ClassCastException occurs here.

        //to avoid this exception and to bring type safety in collections, GENERICS comes to picture.

        ArrayList<Float> aList2 = new ArrayList<>();
//        aList2.add("Om"); //error occurs here //type safety
        aList2.add(40.67f);

        ArrayList<SEB> se = new ArrayList<>();
        se.add(new SEB(65, "Om", 9.36));
        for (SEB s : se)
        {
            System.out.println(s);
        }

//        ArrayList<SEB> se = new ArrayList<>();
//        se.add(new SEB(65, "mp", 24.0));
//
//        for (SEB s : se)
//        {
//            System.out.println(s);
//        }
    }
}