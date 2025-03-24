public class StringConcat
{
    public static void main(String [] args)
    {
        String str = "Hello";
        System.out.println(str);

        String str2 = str.concat(" World");
        System.out.println(str2);

        str = str + " Om ";
        System.out.println(str);

        String str1 = "Hello" + " World";
        System.out.println(str1);

        System.out.println(str1 == str2);

        String s3 = 1+ 2 +3 + "Hello";
        System.out.println(s3);


    }
}
