package gunler.gun31_40.gun34_WrapperClasses;

public class AutoBoxingAndUnBoxing {
    public static void main(String[] args) {
        System.out.println("Autoboxing and Unboxing in Java.");
        //Autoboxing - primitive ---> Wrapper type
        int sayi = 34235; //Primitive data type
        Integer sayiWrp = sayi; //Autoboxing
        System.out.println(sayiWrp);

        //Unboxing - Wrapper type ---> primitive
        Integer sayiWrp1 = 1234;
        int sayi1 = sayiWrp1; //Unboxing
        System.out.println(sayiWrp1);

        int sayi2 = sayiWrp1.intValue(); //Unboxing
    }
}