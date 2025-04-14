import java.util.Iterator;
import java.util.Vector;


public class LaunchVector
{
    public static void main(String[] args)
    {
        Vector v = new Vector();
        v.add(34);
        v.addElement(57);
        v.add(34);
        v.add(34);
        v.add(34);
        System.out.println(v);

        Iterator itr = v.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next()); //exception
//            v.addElement(34);
        }
    }
}