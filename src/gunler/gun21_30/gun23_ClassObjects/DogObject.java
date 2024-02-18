package gunler.gun21_30.gun23_ClassObjects;

public class DogObject {
    public static void main(String[] args) {

        // Class Name    Object Name   =   new Keyword    Class Name / Constructor
        Dog             dog        =      new                  Dog();

        Dog dog2 = new Dog();

        Dog dog3 = new Dog();

        // '.' operator object uzerinden field ve methodlara ulasmaya yardim eder

        dog.ad = "Artis";
        dog.cins = "Av kopegi";
        dog.renk = "Siyah";
        dog.yas = 5;

        System.out.println(dog.ad);
        System.out.println(dog.cins);
        System.out.println(dog.renk);
        System.out.println(dog.yas);

        dog.havla();
        dog.isir();
        dog.mamaYe();
        dog.suruGut();

        // object uzerinden yeniden field a deger atanabilir
        dog.yas = 6;
        System.out.println(dog.yas);

        // object uzerinden eylemler tekrar kullanilabilir
        dog.havla();
        dog.havla();
        dog.havla();

        // Default degerler
        // String icin default deger = null
        System.out.println(dog2.ad);
        System.out.println(dog2.cins);

        // int icin default deger = 0
        System.out.println(dog2.yas);

        // boolean icin default deger = false
        System.out.println(dog2.evcilmi);

        // char icin default deger =
        System.out.println(dog2.cinsiyet);

        dog2.ad = "Kontes";
        System.out.println("dog2.ad = " + dog2.ad);

    }
}
