package gunler.gun21_30.gun28_StringClass_1;

public class StringComparison {
    public static void main(String[] args) {
        //JVM heap memory de oluşturur.
        // New keyword ile oluşturulduğundan String pool a eklenmez.
        String firstHelloWorld = new String("Hello world"); //Heap mem.

        String secondHelloWorld = "Hello world"; //Heap(String pool) mem. JVM bu nesneyi Heap memory deki String pool da oluşturur.
        String thirdHelloWorld = "Hello world"; //Heap(String pool) mem. JVM bu nesne pool da var mı diye bakar varsa adresini bu değişkene atar.

        //JVM heap memory de oluşturur.
        // New keyword ile oluşturulduğundan String pool a eklenmez.
        String forthHelloWorld = new String("Hello world"); //Heap mem.

        //Comparison ---> reference address
        //(==) yapılan karşılaştırma heriki objeninde referans adresleri aynı mı? karşılaştırmasıdır.
        // Literal değer atama ile oluşturulan nesneler JVM tarafından String pool a eklendiğinden
        // pool da bulunan nesneye birden fazla referans olabilir.
        // Dolayısıyla literal tanımlamada yapılan (==) karşılaştırması da yine değişkenlerin referans ettikleri nesnenin adresi üzerinden olacaktır.
        // Bu durumda str1 == str2 herikisi de pooldaki aynı nesneye referans ettiğinden sonuç 'true' olacaktır.
        //Class tiplerde karşılaştırma referans adreslerine göre yapılır.

        System.out.println("(firstHelloWorld == secondHelloWorld) = " + (firstHelloWorld == secondHelloWorld));
        System.out.println("(secondHelloWorld == thirdHelloWorld) = " + (secondHelloWorld == thirdHelloWorld));
        System.out.println("(thirdHelloWorld == forthHelloWorld) = " + (thirdHelloWorld == forthHelloWorld));

        System.out.println("System.identityHashCode(firstHelloWorld) = " + System.identityHashCode(firstHelloWorld));
        System.out.println("System.identityHashCode(secondHelloWorld) = " + System.identityHashCode(secondHelloWorld));
        System.out.println("System.identityHashCode(thirdHelloWorld) = " + System.identityHashCode(thirdHelloWorld));

        //Comparison ---> holding value (.equals)
        System.out.println("firstHelloWorld.equals(secondHelloWorld) = " + firstHelloWorld.equals(secondHelloWorld));
        System.out.println("thirdHelloWorld.equals(forthHelloWorld) = " + thirdHelloWorld.equals(forthHelloWorld));

    }
}
