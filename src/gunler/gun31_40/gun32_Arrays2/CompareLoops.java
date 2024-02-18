package gunler.gun31_40.gun32_Arrays2;
import java.util.Scanner;
public class CompareLoops {

    public static void main(String[] args) {

        int[] sayilar = {1,2,3,4,5,6};

        // Dizeyi ters cevir

        // for each yapamaz
        for(int sayi : sayilar){
            System.out.println("sayi = " + sayi);
        }

        // for loop yapabilir
        for(int i=sayilar.length-1; i>=0; i--){
            System.out.println("sayilar[i] = " + sayilar[i]);
        }


        System.out.println("-----------------");


        System.out.println("Alis Veris Listesi......");
        String[] sepet = new String[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Lutfen sepetinize urun ekleyiniz!");

        // for each ile degisken assign edemiyoruz
        for(String urun : sepet){
            System.out.println("Urun secin");
            urun = sc.nextLine();
        }

        // For loop ile mumkun
//        for(int i=0; i<sepet.length; i++){
//            System.out.println(i+1 + ". urun : ");
//            sepet[i] = sc.nextLine();
//        }

        System.out.println("Sectiginiz urun listesi");

        for(int i=0; i<sepet.length; i++){
            System.out.println(i+1 + ". urun : " + sepet[i]);
        }
    }
}
