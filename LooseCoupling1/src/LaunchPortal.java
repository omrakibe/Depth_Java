public class LaunchPortal
{
    public static void main(String[] args)
    {
        VillaBooking villa = new VillaBooking();
        villa.setMap(new Mapbox());

        boolean status = villa.fetchMap();
        if(status)
            System.out.println("Fetched Successfully");
        else
            System.out.println("Failed to fetch");
    }
}