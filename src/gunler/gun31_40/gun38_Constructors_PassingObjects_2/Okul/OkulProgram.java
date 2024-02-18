package gunler.gun31_40.gun38_Constructors_PassingObjects_2.Okul;
import java.util.ArrayList;

public class OkulProgram {
    public static void main(String[] args) {
        Adres okulAdresi = new Adres("Ankara", "Çankaya");
        Adres ogrenciEvAdresi = new Adres("Ankara", "Altındağ", "Cumhuriyet caddesi", 1923);

        Ogrenci ogrenci = new Ogrenci("Ahmet", "2-B", 18, ogrenciEvAdresi, okulAdresi);
        Ogrenci ogrenci1 = new Ogrenci("Hatice Smith", "1-d", 16, ogrenciEvAdresi, okulAdresi);
        Okul okul = new Okul("ABC Anadolu Lisesi", okulAdresi);


        System.out.println(ogrenci);
        System.out.println(okul);
        System.out.println();

        okul.ogrenciEkle(ogrenci);
        okul.ogrenciEkle(ogrenci1);
        System.out.println(okul);
        System.out.println()
        ;
        Ogrenci ogrenci2 = new Ogrenci("Mehmet");
        Ogrenci ogrenci3 = new Ogrenci("Ali");
        Ogrenci ogrenci4 = new Ogrenci("Zeynep", "3-C", 20,
                new Adres("Ankara"), new Adres("Ankara", "Çankaya"));


        // ArrayList<Ogrenci> ogrenciler = new ArrayList<>(Arrays.asList(ogrenci2,ogrenci3,ogrenci4));
        ArrayList<Ogrenci> ogrenciler = new ArrayList<>();
        ogrenciler.add(ogrenci2);
        ogrenciler.add(ogrenci3);
        ogrenciler.add(ogrenci4);

        Okul yeniOkul = new Okul("Yeni Deneme Lisesi", new Adres(), ogrenciler);
        System.out.println(yeniOkul);

    }
}
