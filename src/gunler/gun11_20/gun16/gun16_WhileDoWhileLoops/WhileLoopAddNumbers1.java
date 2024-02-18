package gunler.gun11_20.gun16.gun16_WhileDoWhileLoops;

import java.util.Scanner;

public class WhileLoopAddNumbers1 {
    public static void main(String[] args) {
        //Klavyeden 0 rakamı girilinceye kadar sayıları toplayan bir program yazınız.

        Scanner klavye = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;
        int sayac = 0;
        boolean devam = true;

        while (devam){
            sayac++;
            System.out.print("klavyeden bir sayı giriniz(bitirmek için 0 giriniz) : ");
            sayi = klavye.nextInt();

            if (sayi == 0){
                // break;
                devam = false;
            }
            toplam += sayi;
            if (sayac %5==0){ // 5 ve 5in katları kadar sayı girildiğinde ara toplamı göster.
                System.out.println("---> Ara toplam = " + toplam);
            }
        }
        System.out.println("sayıların toplamı = " + toplam);
    }
}
