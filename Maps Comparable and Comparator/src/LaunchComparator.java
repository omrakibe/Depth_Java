import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Cricketer
{
    int age;
    String name;
    double avg;

    public Cricketer(int age, String name, double avg)
    {
        super();
        this.age = age;
        this.name = name;
        this.avg = avg;
    }

    @Override
    public String toString()
    {
        return "Cricketer{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", avg=" + avg +
                '}';
    }
}

class Sort implements Comparator<Cricketer>
{
    @Override
    public int compare(Cricketer o1, Cricketer o2)
    {
        if (o1.age > o2.age)
            return 1;
        else
            return -1;
    }
}

public class LaunchComparator
{
    public static void main(String[] args)
    {
        Cricketer player1;
        player1 = new Cricketer(41, "Rohit Sharama", 167.98);
        Cricketer player2;
        player2 = new Cricketer(34, "Surya Kumar", 220.45);
        Cricketer player3;
        player3 = new Cricketer(14, "Vaibhav", 170.5834);

        ArrayList<Cricketer> aList = new ArrayList<>(); //wild card
        aList.add(player1);
        aList.add(player2);
        aList.add(player3);
        System.out.println(aList);

//        Sort sort = new Sort();
//        Collections.sort(aList, sort);
//        System.out.println(aList);

        Comparator<Cricketer> comp = new Comparator<Cricketer>()
        {
            @Override
            public int compare(Cricketer o1, Cricketer o2)
            {
                if (o1.avg > o2.avg)
                    return 1;
                else
                    return -1;
            }
        };

        Collections.sort(aList, comp);
        System.out.println(aList);

        Comparator<Cricketer> comp1 = (Cricketer o1, Cricketer o2) ->
        {
            if (o1.age > o2.age)
                return 1;
            else
                return -1;
        };

        Collections.sort(aList, comp1);
        System.out.println(aList);
    }
}
