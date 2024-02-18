package gunler.gun51_62.gun55_ErrorExceptionHandling1.Exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MultipleExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi = 0;
        int bolen = 0;
        int sonuc = 0;

        try {
            while (true) {
                System.out.print("Lütfen bir tamsayı giriniz : ");
                try {
                    sayi = scanner.nextInt(); //klavyeden girilen değer monitör ediliyor. Bir hatalı durum olursa ilgili catch block yakalayacak
                    break; //Hatalı bir durum olmazsa bu satır çalışır. Hatalı bir durumda programın işleyişi catch block larından devam eder
                } catch (InputMismatchException e) {
                    System.out.println("Girdi uyumsuzluğu hatası oluştu!!!");
                    System.out.println("Hata : " + e);
                    System.err.println("Exception class name : " + e.getClass().getSimpleName()); //Hata classı
                    System.err.println("Exception Message    : " + e.getMessage()); //Orijinal hata mesajı

                    //Hatanın çözümü için
                    //Klavye buffer'ında bulunan hatalı veriyi bufferdan silmek için .nextLine() metodunu kullandık
                    scanner.nextLine();
                }
            }
            System.out.print("Lütfen ikinci tamsayıyı(bölen) giriniz : ");
            bolen = scanner.nextInt();

            sonuc = sayi / bolen;
            System.out.println("sonuc = " + sonuc);

        } catch (ArithmeticException e) {
            System.out.println("Aritmetik işlem hatası oluştu");
            System.out.println("0' a bölünme hatası");
            System.out.println("Exception class is : " + e.getClass().getSimpleName());

            System.out.println(e);
        } catch (InputMismatchException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Hata oluştu : " + e);
        } finally {
            scanner.close();
            System.out.println("Finally blok-Her halukarda çalışan blok"); //Exception oluşsun oluşmasın mutlaka bu blok çalışır
        }
    }
}
