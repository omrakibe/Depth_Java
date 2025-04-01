public class Mapbox implements IMapProvider
{
    public boolean fetchApi(String api)
    {
        System.out.println("Fetching API through Mapbox" + api);
        return true;
    }
}
