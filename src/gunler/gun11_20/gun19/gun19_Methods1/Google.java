package gunler.gun11_20.gun19.gun19_Methods1;

public class Google {
    public static void main(String[] args) {

        // google a git
        // Arama yap
        // Urunu bul sitesine git
        // Urunu sepete ekle
        // Odeme yap
        // Onay kodu al
        // Odemeyi tamamla
        // google a geri don

        System.out.println("Test basladi...");
        google();
        System.out.println("Test sonuclandi...");

    }

    public static void google(){
        System.out.println("Google websitesine gidildi");
        aramaYap();
    }

    public static void aramaYap(){
        System.out.println("Urun aratildi");
        System.out.println("Arama sonuclarindan urun tiklandi");
        urunSitesineGit();
    }

    public static void urunSitesineGit(){
        System.out.println("Urun sitesine gidildi");
        System.out.println("Urun secildi");
        sepeteEkle();
    }

    public static void sepeteEkle(){
        System.out.println("Urun sepete eklendi");
        odemeYap();
    }

    public static void odemeYap(){
        System.out.println("Hesap bilgileri girildi");
        onayKoduAl();
        System.out.println("Onay kodu girildi");
        System.out.println("Odeme tamamlandi");
        System.out.println("Google a geri donuldu");
        // google();
    }

    public static void onayKoduAl(){
        System.out.println("Onay kodu verildi");
    }
}
