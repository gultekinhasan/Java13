package gunler.gun21_30.gun29_StringClass2;

public class StringSubString {
    public static String fullName(String str1, String str2) {
        String result = "";
        str1 = str1.trim();
        str2 = str2.trim();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        str1 = str1.substring(0, 1).toUpperCase() + str1.substring(1);
        str2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);

        result = str1 + " " + str2;
        return result;
    }

    public static void main(String[] args) {
        String myStr = "Hello world";

        System.out.println("myStr.substring(6) = " + myStr.substring(6));
        String subStr = myStr.substring(6);
        System.out.println("subStr = " + subStr);

        subStr = myStr.substring(0, 5);
        System.out.println("subStr = " + subStr);

        String firstName = "   aHmEt";
        String lastName = "   faLANCA";
        String fullName; // Ahmet Falanca

        fullName = fullName(firstName, lastName);
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("fullName = " + fullName);
    }
}
