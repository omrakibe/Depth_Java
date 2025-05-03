import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LaunchCollections
{
    public static void main(String[] args)
    {
        ArrayList<String> aList = new ArrayList<>();
        aList.add("Om");
        aList.add("Azam");
        aList.add("Sejal");
        aList.add("Chota Don");
        aList.add("Rudra");
        aList.add("Nobbie");

        LinkedList<String> lList = new LinkedList<>(aList); //Change of ArrayList into LinkedList.
        System.out.println(lList.getClass().getName());

        Collections.sort(aList);
        System.out.println("Sort: " + aList);

        Collections.shuffle(aList);
        System.out.println("Suffle: " + aList);

        System.out.println(Collections.frequency(aList, "Om"));

    }
}