package gunler.gun21_30.gun27_Random_Math_DateClasses;
import java.util.Random;
import java.util.Scanner;
public class ZarAt {
    public static void main(String[] args) {
        System.out.println("Lutfen 2 zar ile ulasmak istediginiz sayiyi belirtiniz!");
        Scanner sc = new Scanner(System.in);
        int zarToplam = sc.nextInt();

        Random r1 = new Random();
        Random r2 = new Random();

        int zar1, zar2;

        do{
            zar1 = r1.nextInt(6) + 1;
            zar2 = r2.nextInt(6) + 1;
            System.out.println(zar1 + " + " + zar2 + " = " + (zar1 + zar2));
        }while(zar1 + zar2 != zarToplam);
    }
}