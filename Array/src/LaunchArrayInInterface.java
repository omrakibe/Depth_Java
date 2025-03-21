interface Hello
{
    int[] Numbers = {0, 1, 3, 4, 4};
}

class World implements Hello
{
    void helloWorld()
    {
        for (int i = Numbers.length - 1; i >= 0; i--) {
            System.out.print(Numbers[i] + ", ");
        }
    }
}

public class LaunchArrayInInterface
{
    public static void main(String[] args)
    {
        new World().helloWorld();
    }
}
