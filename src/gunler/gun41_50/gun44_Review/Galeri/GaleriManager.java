package gunler.gun41_50.gun44_Review.Galeri;

import java.util.Scanner;

public class GaleriManager {

    public static void arabaEkle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Araba markasını giriniz");
        String marka = scanner.nextLine();

        System.out.println("Araba modelini giriniz");
        String model = scanner.nextLine();

        System.out.println("Araba VIN no'sunu giriniz");
        String vinNo = scanner.nextLine();

        System.out.println("Araba plakasını giriniz");
        String plaka = scanner.nextLine();

        Galeri.addAraba(new Araba(marka,model,vinNo,plaka));

    }


    public static void main(String[] args) {
        Galeri.showAraba();
        System.out.println("\nGaleride Topam : " + Galeri.getArabalarSayisi() + "Araba Var.");

        Galeri.addAraba(new Araba("TOGG","New","TGG-123456789","34TGG1234"));

        System.out.println();
        Galeri.showAraba();

        System.out.println("\nGaleride Topam : " + Galeri.getArabalarSayisi() + "Araba Var.");

        Galeri.listArabalarByName("Toyota");

        System.out.println();
        Galeri.silArabaPlaka("F-HF99624");
        System.out.println();

        Galeri.showAraba();
        System.out.println();

        Galeri.showArabalarSilinen();
        System.out.println();

        Galeri.showArabalarV1();



        arabaEkle();
        Galeri.showAraba();
    }
}
