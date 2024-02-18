package gunler.gun21_30.gun28_StringClass_1;

public class StringClass {
    public static void main(String[] args) {
        System.out.println("Creating String object in java.");
        //1. By String literal
        //     Stack  Heap(String pool)
        String str1 = "Java";
        String str3 = "Java";

        System.out.println("str1 ---> " + System.identityHashCode(str1));
        System.out.println("str3 ---> " + System.identityHashCode(str3));

        //2. By new keyword (new String())
        //     Stack               Heap
        String str2 = new String("Merhaba");
        String str4 = new String("Merhaba");

        System.out.println("str2 ---> " + System.identityHashCode(str2));
        System.out.println("str4 ---> " + System.identityHashCode(str4));

    }
}
