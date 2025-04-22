import java.util.ArrayList;
import java.util.Collections;

class Cricketer1 implements Comparable<Cricketer1>
{

    int age;
    String name;
    double avg;

    public Cricketer1(int age, String name, double avg)
    {
        super();
        this.name = name;
        this.age = age;
        this.avg = avg;
    }

    @Override
    public String toString()
    {
        return "Cricketer1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", avg=" + avg +
                '}';
    }

    @Override
    public int compareTo(Cricketer1 o)
    {
        if (this.age > o.age)
            return 1;
        else
            return -1;
    }
}

public class LaunchComparable
{
    public static void main(String[] args)
    {
        Cricketer1 player3 = new Cricketer1(20, "Om Rakibe", 250.494);
        Cricketer1 player2 = new Cricketer1(25, "Vicky", 280.494);
        Cricketer1 player1 = new Cricketer1(21, "Pinu", 260.494);

        ArrayList<Cricketer1> aList = new ArrayList<>();
        aList.add(player1);
        aList.add(player2);
        aList.add(player3);

        System.out.println(aList);

        Collections.sort(aList);
        System.out.println(aList);
    }
}
