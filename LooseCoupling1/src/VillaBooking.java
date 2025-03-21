public class VillaBooking
{
    private IMapProvider map;

    public void setMap(IMapProvider map)
    {
        this.map = map;
    }

    public boolean fetchMap()
    {
        return map.fetchApi("mapapikeyfactor");
    }

}
