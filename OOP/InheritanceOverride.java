class Aeroplane {
     void fly()
    {
        System.out.println("Aeroplane starts to fly");
    }
    protected void takeOff(int age)
    {
        System.out.println("Aeroplane starts to takeoff");
    }
    public void planeLastingAge()
    {
        System.out.println("Aeroplane runs upto 20 years");
    }
    public Animal planeLands()      //co-variants
    {
        Animal animal = new Animal();
        return animal;
    }
}
class CargoPlane extends Aeroplane
{
    protected void fly(int a)
    {
        System.out.println("CargoPlane Starts to fly");
    }
    protected void takeOff(int age)
    {
        System.out.println("Cargo Plane starts to takeoff");
    }
    public void takeOff()
    {
        System.out.println("CargoPlane required longer runway to take off");
    }
    public Deer planeLands()
    {
        Deer deer = new Deer();
        return deer;
    }
}

public class InheritanceOverride
{
    public static void main(String[] args)
    {
        CargoPlane cp = new CargoPlane();
        cp.fly();
    }
}
