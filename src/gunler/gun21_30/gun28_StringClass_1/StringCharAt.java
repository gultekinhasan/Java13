package gunler.gun21_30.gun28_StringClass_1;

public class StringCharAt {
    public static void main(String[] args) {
        //.charAt() metodu
        //            0123
        String str = "Java course";

        System.out.println("str.charAt(0) = " + str.charAt(0));
        System.out.println("str.charAt(1) = " + str.charAt(1));
        System.out.println("str.charAt(2) = " + str.charAt(2));
        System.out.println("str.charAt(3) = " + str.charAt(3));
        System.out.println("str.length() = " + str.length());
        System.out.println();
        //Traversing String object elements by using loop

        for (int i = 0; i < str.length(); i++) {
            System.out.println("str.charAt(i) = " + str.charAt(i));
        }
        System.out.println();
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + ",");
        }
        //J,a,v,a,  c,o,u,r,s,e
    }
}
