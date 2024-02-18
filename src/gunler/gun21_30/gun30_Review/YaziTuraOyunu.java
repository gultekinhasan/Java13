package gunler.gun21_30.gun30_Review;
import java.util.Random;
import java.util.Scanner;
public class YaziTuraOyunu {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
    //5 kez yazi tura atarak kac defasında dogru cevap verdigini gosteren bir code yazınız
    // kullanıcı olarak bir tahminde bulunun
    // bilgisayara yazi tura attiriniz
    // karsilastirarak puaninizi hesaplayin

        System.out.println("*********** YAZI TURA OYUNUNA HOSGELDİNİZ **************");
        System.out.println("Her Atista 'yazi' veya 'tura' Olarak Tahminde Bulununuz.");

        int tur  =5;
        int puan =0;

        for (int i =1;i<=tur;i++){
            System.out.print(i+".tur " + "Tahmin Et :");
            String oyuncuTahmini = sc.nextLine().toLowerCase();

            int sonuc = random.nextInt(2);
            String yaziTura = (sonuc==0)?"yazi":"tura";
            System.out.println("yaziTura = " + yaziTura);

            if (oyuncuTahmini.equals(yaziTura)){
                System.out.println("Dogru Tahmin");
                puan++;
            }else System.out.println("Yalnis Tahmin");
        }
        System.out.println("oyun bitti !" + tur + " turda senin tahmin puanin " + puan);
    }
}
