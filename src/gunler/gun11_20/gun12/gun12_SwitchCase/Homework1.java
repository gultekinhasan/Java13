package gunler.gun11_20.gun12.gun12_SwitchCase;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {

        /* Klavyeden 1 ile 5 arası 5 adet int veri tipinde sayı girin(Scanner Class'ını kullanabilirsiniz)
         Ekrana bu sayıların metin karşılıklarını switch case yapısını kullanarak yazdıran bir program yazın.
         Bir, İki ....gibi */

        Scanner scanner= new Scanner(System.in);

        System.out.print("LÜTFEN SAYI GİRİNİZ : " );
        int rakam = scanner.nextInt();
        String rakamStr = "";

        switch (rakam){
            case 1:
                rakamStr=  "BİR";
                break;
            case 2:
                rakamStr = "İKİ";
                break;
            case 3:
                rakamStr = "ÜÇ";
                break;
            case 4:
                rakamStr = "DÖRT";
                break;
            case 5:
                rakamStr = "BEŞ";
                break;
            default:
                System.out.println("GEÇERSİZ SAYI...");
        }
            if (rakamStr != ""){
                System.out.println(rakamStr);
            }














    }
}
