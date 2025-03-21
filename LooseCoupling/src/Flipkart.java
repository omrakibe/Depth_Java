public class Flipkart
{
    private IDelivery delivery; //IDelivery delivery = new IDelivery

    public void setDelivery(IDelivery delivery) //IDelivery delivery = new BlueDart();
    {
        this.delivery = delivery;
    }

    public boolean deliverTheProduct()
    {
        return delivery.deliverTheProduct(8993.383);
    }
}
