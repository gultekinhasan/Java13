package gunler.gun31_40.gun35_Review;
import java.util.Scanner;

public class TelefonRehber {
    public static void findByName(Person[] rehber, String isim) {
        System.out.println("İsimden bul metod çalıştı....");
        int counter = 0;
        for (Person kisi : rehber) {
            if (kisi != null && kisi.firstName.contains(isim.trim())) {
                kisi.printInfo();
                counter++;
                System.out.println("-----------------------------");
            }
        }
        if (counter == 0) {
            System.out.println(isim + " adlı kişi rehberde yok!");
        } else System.out.println(counter + " adet kayıt listelendi..");
    }
    public static void findByLastName(Person[] rehber, String isim) {
        System.out.println("Soyadtan bul metod çalıştı....");
        int counter = 0;
        for (Person kisi : rehber) {
            if (kisi != null && kisi.lastName.contains(isim.trim())) {
                kisi.printInfo();
                counter++;
                System.out.println("-----------------------------");
            }
        }
        if (counter == 0) {
            System.out.println(isim + " soyadlı kişi rehberde yok!");
        } else System.out.println(counter + " adet kayıt listelendi..");
    }
    public static void findByFirstAndLastName(Person[] rehber, String isim, String soyad){


    }
    public static void listAllPerson(Person[] rehber){
        System.out.println("Telefon rehberindeki kişilerin listesi");
        int count = 1;
        for (Person kisi: rehber){
            if (kisi != null){
                /*kisi.printInfo();
                System.out.println("---------------------------------");*/
                System.out.print(count + "-");
                kisi.printInfoTable();
                count++;
            }
        }
    }
    public static void scannerInput(Person[] rehber) {
        Scanner scanner = new Scanner(System.in);
        String fName = "";
        String lName = "";
        String phoneNumber = "";
        String address = "";

        System.out.println("Rehber programına hoş geldiniz...");
        System.out.print("Lütfen kişinin adını giriniz    : ");
        fName = scanner.nextLine();

        System.out.print("Lütfen kişinin soyadını giriniz : ");
        lName = scanner.nextLine();

        System.out.print("Lütfen kişinin tel.No giriniz   : ");
        phoneNumber = scanner.nextLine();

        System.out.print("Lütfen kişinin adresini giriniz : ");
        address = scanner.nextLine();

        rehber[2] = new Person(fName, lName, phoneNumber, address);
        rehber[2].printInfo();
    }

    public static void main(String[] args) {
        Person[] rehber = new Person[10];
        rehber[0] = new Person("Hasan", "Falanca", "216-345 456 00 90", "Falanca yer Ankara/Turkiye");

        //    rehber[0].printInfo();
        //    System.out.println();

        Person person = new Person("Hasan", "Kaçan", "87346827468", "Bir adres...");
        rehber[1] = person;
        //    rehber[1].printInfo();

        //  scannerInput(rehber);

        //  findByName(rehber, "Hasan");
        //  findByLastName(rehber,"Falanca");

        listAllPerson(rehber);
    }
}
