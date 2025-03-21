interface  IF1
{
    int disp(int a, int b);
}

interface IF2
{
    float disp(int x);
}

public class LaunchLambda1
{
    public static void main(String[] args)
    {
        IF1 f1 = (a, b) -> a+b;
        System.out.println(f1.disp(2, 4));

        IF2 f2 = x -> {
            int res = x+3;
            return res;
        };
    }
}