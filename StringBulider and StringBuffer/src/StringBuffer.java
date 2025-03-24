public class StringBuffer
{
    public static void main(String[] args)
    {
        java.lang.StringBuffer sb1 = new java.lang.StringBuffer("Om");
        java.lang.StringBuffer sb2 = new java.lang.StringBuffer("Om");
//      int res = sb.capacity();
        System.out.println(sb1 == sb2); //false
        System.out.println(sb1.equals(sb2)); //false



    }

}