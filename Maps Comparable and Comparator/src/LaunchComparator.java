class Cricketer {
    int age;
    String name;
    int avg;

    public Cricketer(int age, String name, int avg)
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

public class LaunchComparator
{
    public static void main(String [] args)
    {

    }
}
