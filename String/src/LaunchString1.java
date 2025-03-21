public class LaunchString1
{
    public static void main(String[] args)
    {
        String name = "Om";
        String name1 = "Om";

//        switch (name) {
//            case "Hello" -> System.out.println("No");
//            case "Om" -> System.out.println("yes");
//        }

        String surname = new String("Om");
        String surname1 = new String("Om");

        System.out.println(name == name1);
        System.out.println(name.equals(surname));

        System.out.println(surname == surname1);    //false
        System.out.println(surname.equals(surname1));
    }
}