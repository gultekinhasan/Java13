package gunler.gun31_40.gun31_Arrays;

import java.util.Scanner;

public class AlisVeris {
    public static void main(String[] args) {
        // Dongu kullanarak, kullanicidan urunleri almak kaydiyla bir urun listesi olusturunuz

        System.out.println("Alis Veris Listesi......");
        String[] sepet = new String[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Lutfen sepetinize urun ekleyiniz!");

        for(int i=0; i<sepet.length; i++){
            System.out.println(i+1 + ". urun : ");
            sepet[i] = sc.nextLine();
        }

        System.out.println("Sectiginiz urun listesi");

        for(int i=0; i<sepet.length; i++){
            System.out.println(i+1 + ". urun : " + sepet[i]);
        }
    }
}
