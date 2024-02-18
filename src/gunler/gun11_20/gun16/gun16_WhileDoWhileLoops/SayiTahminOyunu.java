package gunler.gun11_20.gun16.gun16_WhileDoWhileLoops;
import java.util.Scanner;
public class SayiTahminOyunu {
    public static void main(String[] args) {
        Scanner tahmin = new Scanner(System.in);
        System.out.println("Sayı tahmin oyunu...");
        // System.out.println(Math.random());

        //(int) (Math.random() * (max - min) + min)
        int min = 1;
        int max = 11; //11 dahil değil
        int rastgeleSayi = (int) (Math.random() * (max - min) + min); // 1 ve 10 dahil
        int tahminSayi = 0;

        //System.out.println((int) (Math.random() * (11 - 1)  + 1 ));
       /* System.out.println((int) (Math.random() * (max - min)  + min ));
        System.out.println((int) (Math.random() * (max - min)  + min ));
        System.out.println((int) (Math.random() * (max - min)  + min ));
        System.out.println((int) (Math.random() * (max - min)  + min ));*/
        System.out.print("Ben bir sayı tuttum. Tahminiz nedir? ");
        tahminSayi = tahmin.nextInt();

        int tahminAdedi = 1;
        while (tahminSayi != rastgeleSayi) {
            tahminAdedi++;
            System.out.println("Tahminiz yanlış!");
            if(tahminSayi > rastgeleSayi){
                System.out.println("Tahmin ettiğiniz sayı benim tuttuğum sayıdan büyük.");
            }else System.out.println("Tahmin ettiğiniz sayı benim tuttuğum sayıdan küçük.");
            System.out.print("Yeni tahmininiz : ");
            tahminSayi = tahmin.nextInt();
        }
        System.out.println("Tebrikler tahmininiz doğru." + tahminAdedi + " tahminde bildiniz.");
    }
}
