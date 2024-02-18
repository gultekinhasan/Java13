package gunler.gun31_40.gun31_Arrays;
import java.util.Scanner;
public class Aylar {
    public static void main(String[] args) {

        String [] aylar = new String[12];
        aylar [0] = "Ocak";
        aylar [1] = "Subat";
        aylar [2] = "Mart";
        aylar [3] = "Nisan";
        aylar [4] = "Mayis";
        aylar [5] = "Haziran";
        aylar [6] = "Temmuz";
        aylar [7] = "Agustos";
        aylar [8] = "Eylul";
        aylar [9] = "Ekim";
        aylar [10] = "Kasım";
        aylar [11] = "Aralık";

        System.out.println("Lutfen dogdunuz ayi giriniz!");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();

        if(index>0 && index<=12){
            System.out.println("Dogum ayiniz : " + aylar[index-1]);
        }else{
            System.out.println("Yanlis ay girdiniz...");
        }


    }
}
