package gunler.gun21_30.gun26_Review;
import java.util.Scanner;

public class SquareTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Square kare1 = new Square();

        System.out.print("Karenin kenar uzunluğunu giriniz = ");
        int kenarUser = sc.nextInt();

        kare1.kenar = kenarUser;
        System.out.println("kare1.alanHesapla() = " + kare1.alanHesapla());
        System.out.println("kare1.cevreHesapla() = " + kare1.cevreHesapla());

        System.out.print("Kenar uzunluğu " + kenarUser + " birim olan karenin alanı nedir? ");
        int cevap = sc.nextInt();
        if(cevap == kare1.alanHesapla()){
            System.out.println("Doğru bildiniz.Tebrikler");
        }else {
            System.out.println("Cevabınız yanlış!!!");
            System.out.println("Kenar uzunluğu " + kenarUser + " birim olan karenin alanı = " + kare1.alanHesapla() + " birimdir.");
        }

        //Çevresi ile ilgili soru

    }
}
