import java.util.TreeSet;

public class LaunchTreeSet1
{
    public static void main(String[] args)
    {
        TreeSet tSet = new TreeSet();
        tSet.add(2);
        tSet.add(45);
        tSet.add(3);
        tSet.add(23);
        tSet.add(90);
        tSet.add(79);
        tSet.add(28);

        System.out.println(tSet);

        System.out.println("higher()");
        System.out.println(tSet.higher(21)); //23
        System.out.println(tSet.higher(23)); //28
        System.out.println(tSet.higher(90));

        System.out.println("lower()");
        System.out.println(tSet.lower(4)); //3
        System.out.println(tSet.lower(90)); //79
        System.out.println(tSet.lower(2)); //null

        System.out.println("ceiling()");
        System.out.println(tSet.ceiling(2)); //2
        System.out.println(tSet.ceiling(4)); //23
        System.out.println(tSet.ceiling(91)); //null

        System.out.println("floor()");
        System.out.println(tSet.floor(83)); //79
        System.out.println(tSet.floor(45)); //45
        System.out.println(tSet.floor(1)); //null

        System.out.println("headSet()");
        System.out.println(tSet.headSet(25)); //[2, 3, 23]
        System.out.println(tSet.headSet(45)); //[2, 3, 23, 28]
        System.out.println(tSet.headSet(2));  //[]

        System.out.println("tailSet()");
        System.out.println(tSet.tailSet(45)); //[45, 79, 90]
        System.out.println(tSet.tailSet(90)); //[90]
        System.out.println(tSet.tailSet(95)); //[]
    }
}