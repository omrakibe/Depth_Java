public class GoogleMap implements IMapProvider
{
    public boolean fetchApi(String api)
    {
        System.out.println("Fetching API through GoogleMap " + api);
        return true;
    }
}
