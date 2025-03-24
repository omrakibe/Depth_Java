interface Add {
    float add(int a, float b);
}

public class LaunchLambda2
{
    public static void main(String[] args) {
        Add add = (a, b) -> a+b;

        float res = add.add(3, 5.5f);
        System.out.println(res);

    }
}
