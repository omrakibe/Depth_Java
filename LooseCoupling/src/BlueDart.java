public class BlueDart implements IDelivery
{
    public boolean deliverTheProduct(double amount)
    {
        System.out.println("The product is Delivered by Bluedart at amount of " + amount);
        return true;
    }
}
