package gunler.gun21_30.gun30_Review;
import java.util.Random;
import java.util.Scanner;
public class YaziTuraOyunu_MethodVersion {


    public static void main(String[] args) {

        // 5 kez yazi tura atarak kac defasinda dogru cevap veridigini gosteren bir code yaziniz
        // Kullanici olarak tahminde bulunun
        // Bilgisayara yazi tura attirin
        // Karsilastirarak puaninizi hesaplayin

        int tur = 5;
        int puan = 0;
        oyunOyna(tur, puan);
    }

    public static void oyunOyna(int tur, int puan) {
        for (int i = 1; i <= tur; i++) {
            System.out.println(i + ".tur" + " Tahmin et");
            String oyuncuTahmini = tahmindeBulun();
            String yaziTura = yaziTuraAt();
            puan = karsilastir(oyuncuTahmini, yaziTura, puan);
        }

        System.out.println("Oyun Bitti! " + tur + " turda senin tahmin puanin " + puan);
    }

    public static String yaziTuraAt() {
        Random random = new Random();
        int sonuc = random.nextInt(2);
        String yaziTura = (sonuc == 0) ? "yazi" : "tura";
        System.out.println("Yazi Tura sonuc: " + yaziTura);
        return yaziTura;
    }

    public static String tahmindeBulun() {
        System.out.println("****** Yazi Tura Oyununa Hos geldiniz! ******");
        System.out.println("Her atista 'yazi' veya 'tura' olarak tahminde bulununuz.");

        Scanner sc = new Scanner(System.in);
        return sc.nextLine().toLowerCase();
    }

    public static int karsilastir(String oyuncuTahmini, String yaziTura, int puan) {
        if (oyuncuTahmini.equals(yaziTura)) {
            System.out.println("Dogru Tahmin");
            puan++;
        } else {
            System.out.println("Yanlis Tahmin");
        }
        return puan;
    }
}

