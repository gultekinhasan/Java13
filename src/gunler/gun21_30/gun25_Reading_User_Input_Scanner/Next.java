package gunler.gun21_30.gun25_Reading_User_Input_Scanner;
import java.util.Scanner;
public class Next {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir kelime giriniz :");
        String kelime = sc.next(); //klavyeden girilen sadece ilk kelimeyi okur ve kalvye buffer'dan siler.
        System.out.println("kelime = " + kelime);

        int satir = sc.nextInt(); //.next() metodundan artakalan ve int veritipine uyumlu olmayan bir veri kalmışsa hata verir
        System.out.println("satir = " + satir);
    }
}
