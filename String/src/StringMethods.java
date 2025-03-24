public class StringMethods
{
    public static void main(String [] args)
    {
        String str = "Chhatrapati Sambhaji Maharaj";

        int len = str.length();
        System.out.println(len);

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(10));
        System.out.println(str.substring(12, 20));
        System.out.println(str.startsWith("Chh"));

        String str1 = "Dhoni";
        String str2 = "Kolhi";

        int res = str1.compareTo(str2);
        System.out.println(res);
    }
}
