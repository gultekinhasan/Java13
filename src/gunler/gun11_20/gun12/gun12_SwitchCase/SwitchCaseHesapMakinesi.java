package gunler.gun11_20.gun12.gun12_SwitchCase;
import java.util.Scanner;

public class SwitchCaseHesapMakinesi {
    public static void main(String[] args) {
        Scanner islemOpr = new Scanner(System.in);
        Scanner sayiGir = new Scanner(System.in);

        String islemOperatoru = "";
        int sayi1 = 0;
        int sayi2 = 0;
        int sonuc = 0;

        System.out.println("                  Hesap Makinesi                      ");
        System.out.println("------------------------------------------------------");
        System.out.print("Bir işlem operatörü giriniz ---> '+' , '-', '*', '/'  : ");
        islemOperatoru = islemOpr.nextLine();

        System.out.print("1. sayıyı giriniz                                     : ");
        sayi1 = sayiGir.nextInt();

        System.out.print("2. sayıyı giriniz                                     : ");
        sayi2 = sayiGir.nextInt();

        switch (islemOperatoru) {
            case "+":
                sonuc = sayi1 + sayi2;
                break;
            case "-":
                sonuc = sayi1 - sayi2;
                break;
            case "*":
                sonuc = sayi1 * sayi2;
                break;
            case "/":
                sonuc = sayi1 / sayi2;
                break;
            default:
                System.out.println("Yanlış bir operatör girdiniz!!!");


        }
        System.out.println("İşlem sonucu = " + sonuc);


        //Advanced switch case
        switch (islemOperatoru) {
            case "+" -> sonuc = sayi1 + sayi2;
            case "-" -> sonuc = sayi1 - sayi2;
            case "*" -> sonuc = sayi1 * sayi2;
            case "/" -> sonuc = sayi1 / sayi2;
            default -> System.out.println("Yanlış bir operatör girdiniz!!!");
        }

        //Advanced switch case
        sonuc = switch (islemOperatoru) {
            case "+" -> sayi1 + sayi2;
            case "-" -> sayi1 - sayi2;
            case "*" -> sayi1 * sayi2;
            case "/" -> sayi1 / sayi2;
            default -> 0;
        };

        System.out.println("İşlem sonucu                                 = " + sonuc);


    }
}