package gunler.gun21_30.gun29_StringClass2;

public class StringConcat {
    public static void main(String[] args) {
        String str = "Merhaba"; //created in String pool
        String str1 = "Java"; //created in String pool

        System.out.println("System.identityHashCode(str) = " + System.identityHashCode(str));
        System.out.println("str = " + str);
        System.out.println("str1 = " + str1);
        System.out.println(str + str1 + "Deneme"); //Tercih edilen concatenation işlemi + operatörü --> more readable
        System.out.println(".concat()---> " + str.concat(str1).concat("Deneme"));
        System.out.println("str = " + str); //String class is immutable therefore value can not be changed.

        System.out.println("System.identityHashCode(str) = " + System.identityHashCode(str));

        System.out.println("System.identityHashCode(str.concat(str1)) = " + System.identityHashCode(str.concat(str1).concat("Deneme")));

        str = str.concat(str1); //after concatenation a new string object created and its address/reference is assigned to str
        System.out.println("System.identityHashCode(str) = " + System.identityHashCode(str));
        System.out.println("str = " + str);
    }
}
