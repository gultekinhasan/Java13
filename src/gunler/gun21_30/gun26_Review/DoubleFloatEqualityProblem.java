package gunler.gun21_30.gun26_Review;

import gunler.gun21_30.gun25_Reading_User_Input_Scanner.SayilarinOrtalamasi;

import java.util.Scanner;

public class DoubleFloatEqualityProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sayiA = 1.000001;
        double sayiB = 0.000001;

        double sonuc = sayiA - sayiB;
        System.out.println("sonuc = " + sonuc);

        System.out.print("1.00001 - 0.00001 = ? ");
        double cevap = sc.nextDouble();
        if(sonuc == cevap){
            System.out.println("Doğru bildiniz.");
            System.out.println("sonuc = " + sonuc);

        }else {
            System.out.println("Cevabınız yanlış!!!");
            System.out.println("Doğru cevap = " + sonuc);
        }

        if(doubleEsitmi(sonuc,cevap)){
            System.out.println("Double eşit mi metoduna göre cevabınız doğru.");
        }else System.out.println("Double eşit mi metoduna göre cevabınız yanlış!!!");

    }
    public static boolean doubleEsitmi(double sayi1, double sayi2){
        //Belirli bir tolerans değeri oluşturup işlem sonucunu bu tolerans değeri ile
        // karşılaştırarak iki double/float sayının eşitliğini kontrol edebiliriz.
        //Epsilon değeri ne kadar kuçuk olursa duyarlılık o kadar fazla olur. Tavsiye edilen duayrlılık 5 veya 6 basamağı geçmemeli
        double epsilon = 0.00001; //Eşitlik için tolerans değeri
        return (Math.abs(sayi1-sayi2) < epsilon); //Math.abs() mutlak değer metodu.
    }
}
