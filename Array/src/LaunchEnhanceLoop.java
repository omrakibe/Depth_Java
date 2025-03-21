public class LaunchEnhanceLoop
{
    public static void main(String [] args)
    {
        int []arr = new int[70];

        for(int i=0; i<arr.length; i++)
        {
            arr[i] = (int) Math.floor(Math.random()*100);
        }

        for(int n : arr)
        {
            System.out.println(n);
        }
    }
}
