package gunler.gun21_30.gun28_StringClass_1;

public class StringReverse {
    public static String reverseString(String str){
        String revStr = "";
        //Printing reverse order
        for (int i = str.length()-1; i >=0 ; i--) {
            revStr += str.charAt(i);
        }
        return revStr;
    }
    public static boolean isPalindrome(String str){
        return (str.equals(reverseString(str)));
    }
    public static boolean isPlalindromeUzun(String str){
        String reverseStr = "";
        reverseStr = reverseString(str);
        if(reverseStr.equals(str)){
            return true;
        }else return false;
    }

    public static void main(String[] args) {
        String str = "Java";

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        //Printing reverse order
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        System.out.println("reverseString(str) = " + reverseString(str));

        System.out.println("isPalindrome(\"Java\") = " + isPalindrome("Java"));
        System.out.println("isPalindrome(\"küçük\") = " + isPalindrome("küçük"));
        System.out.println("isPalindrome(\"aba\") = " + isPalindrome("aba"));
        System.out.println("isPlalindromeUzun(\"Java\") = " + isPlalindromeUzun("Java"));
        System.out.println("isPlalindromeUzun(\"aba\") = " + isPlalindromeUzun("aba"));


        if(isPalindrome("ava")){
            System.out.println("Palindrome dur.");
        }else System.out.println("Palindrome değildir!!");

        boolean result = isPalindrome("küçük");
        if(result){
            System.out.println("Palindrome dur.");
        }else System.out.println("Palindrome değildir!!");
    }
}
