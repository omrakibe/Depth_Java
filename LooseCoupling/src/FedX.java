public class FedX implements IDelivery
{
    @Override
    public boolean deliverTheProduct(double amount) {
        System.out.println("The product is Delivered by FedX at amount of" + amount);
        return true;
    }
}
