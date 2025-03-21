class multiply
{
    public float mul(int a, float b)
    {
        return a*b;
    }
    public float mul(float a, int b)
    {
        return a*b;
    }
    public int mul(int a, int b)
    {
        System.out.println(a*b);
        return 0;
    }
}

public class MO2 {
    public static void main(String[] args) {
    multiply prod = new multiply();
    System.out.println(prod.mul(5, 2.3f));
    int res = (int)prod.mul(3.3f, 3);
    System.out.println(res);
    float res2 = (float)prod.mul(3, 3);
    System.out.println(res2);
    }
}
