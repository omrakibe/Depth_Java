public class LaunchApp
{
    public static void main(String[] args)
    {
        Flipkart f = new Flipkart(); //target object
        f.setDelivery(new BlueDart());  //Dependency Injection

        boolean status = f.deliverTheProduct();
        if(status)
            System.out.println("Product deliver successfully");
        else
            System.out.println("Product failed to deliver");
    }
}