class Om
{
    int ID;
    String Name;
}

public class LaunchArray2
{
    public static void main(String[] args)
    {
        Om []tel = new Om[3];

        tel[0] = new Om();
        tel[0].ID = 65;
        tel[0].Name = "Om";

        tel[1] = new Om();
        tel[1].ID = 71;
        tel[1].Name = "Ganesh";


        System.out.println(tel[0]);
        System.out.println(tel[1]);
    }
}
