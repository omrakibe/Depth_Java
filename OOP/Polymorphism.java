class Flight
{
    public void fly()
    {
        System.out.println("Flight is Flying");
    }
    public void takeOff()
    {
        System.out.println("Flight is taking off");
    }
}
class CargoFlight extends Flight
{
    public void fly()
    {
        System.out.println("CargoFlight is Flying");
    }
    public void takeOff()
    {
        System.out.println("CargoFlight is taking off");
    }
}
class FighterFlight extends Flight
{
    public void fly()
    {
        System.out.println("FighterFlight is Flying");
    }
    public void takeOff()
    {
        System.out.println("FighterFlight is taking off");
    }
}
class PassengerFlight extends Flight
{
    public void fly()
    {
        System.out.println("PassengerFlight is Flying");
    }
    public void takeOff()
    {
        System.out.println("PassengerFlight is taking off");
    }
}

class Airport
{
    public void permit(Flight flight) //FLight flight = new Flight();
    {
        flight.fly();               //Polymorphism occurs here
        flight.takeOff();
    }
}


public class Polymorphism
{
    public static void main(String[] args)
    {
        Flight flight = new Flight();
        CargoFlight cp = new CargoFlight();
        FighterFlight fp = new FighterFlight();
        PassengerFlight pp = new PassengerFlight();

        Airport air = new Airport();
        air.permit(flight);
        air.permit(cp);
        air.permit(fp);
        air.permit(pp);
    }
}
