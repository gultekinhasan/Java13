package gunler.gun21_30.gun29_StringClass2;

public class StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "hello";
        String str4 = "Merhaba";
        String str5 = new String("Hello");

        //.equals() Compares values
        System.out.println("str1.equals(str2) = " + str1.equals(str2));
        System.out.println("str1.equals(str3) = " + str1.equals(str3));
        System.out.println("str1.equalsIgnoreCase(str3) = " + str1.equalsIgnoreCase(str3));
        System.out.println("str1.equals(str4) = " + str1.equals(str4));
        System.out.println("str1.equals(str5) = " + str1.equals(str5));

        //== compares reference addresses
        System.out.println("(str1 == str2) = " + (str1 == str2));
        System.out.println("(str1 == str3) = " + (str1 == str3));
        System.out.println("(str1 == str4) = " + (str1 == str4));
        System.out.println("(str1 == str5) = " + (str1 == str5));
    }
}
