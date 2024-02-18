package gunler.gun21_30.gun24_Memory_Garbage_Collection;

public class HeapOverFlow {
    public static void main(String[] args) {
        String str1 = "Merhaba"; //Immutable--- değiştirilemez
        System.out.println("str1 = " + str1);
        System.out.println("System.identityHashCode(str1) = " + System.identityHashCode(str1));

        str1 = "Merhaba Java";
        System.out.println("str1 = " + str1);
        System.out.println("System.identityHashCode(str1) = " + System.identityHashCode(str1));

        int counter = 0;

        //Out of Memory  (heap space) hatası oluşur. str1 değişkeni öyle bir değere atamasına gelirki nesnenin büyüklüğü Heap sığmaz ve hata verir.
        while (true){
            //   counter++;
            System.out.println(counter++);
            str1 += str1;//Her seferinde yeni bir nesne oluşur.
            //Her seferinde yeni nesneye atanacak karakter sayısı iki katına çıkar.
            //Garbage Collection çalışmasına rağmen bir zaman sonra yeni oluşacak nesnenin büyüklüğü heap e sığmaz ve hata verir.
            System.out.println("System.identityHashCode(str1) = " + System.identityHashCode(str1));
        }
    }
}
