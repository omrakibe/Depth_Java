class Om
{
    int ID;
    String Name;
}

public class LaunchArray2
{
    public static void main(String[] args)
    {
        Om[] tel = new Om[3];

        tel[0] = new Om();
        tel[0].ID = 65;
        tel[0].Name = "Om";

        tel[1] = new Om();
        tel[1].ID = 71;
        tel[1].Name = "Ganesh";

        tel[2] = new Om();
        tel[2].ID = 34;
        tel[2].Name = "Tambe";

        System.out.println(tel[0].Name);
        System.out.println(tel[1]);
        System.out.println(tel[2].Name);
    }
}
