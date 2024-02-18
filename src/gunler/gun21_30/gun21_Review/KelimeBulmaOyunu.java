package gunler.gun21_30.gun21_Review;
import java.util.Scanner;
public class KelimeBulmaOyunu {
    public static void menu(){
        System.out.println("-------Kelime Bulma Oyunu--------");
        System.out.println("-----------Kelime Listesi--------");
        System.out.println("..elma,armut,kiraz,kavun,karpuz..");
        System.out.println("---------------------------------");
        System.out.println("Listeden rastgele bir kelime seçeceğim.Tahmin et!");
        System.out.println();
    }
    public static String rastgeleKelime(){
        int sayi = (int)(Math.random() * 5 + 1);
        switch (sayi){
            case 1:
                return "elma";
            case 2:
                return "armut";
            case 3:
                return "kiraz";
            case 4:
                return "kavun";
            case 5:
                return "karpuz";

        }
        return "Bilinmeyen kelime!!";
    }
    public static void oyunaBasla(){
        Scanner scanner = new Scanner(System.in);
        String tahmin="";

        String kelime = rastgeleKelime();
        System.out.println("***Rastgele bir kelime seçtim.***");

        int counter = 0;
        do {
            counter++;
            System.out.print("Tahminiz ---> ");
            tahmin = scanner.nextLine();

            if(kelime.equalsIgnoreCase(tahmin)){
                System.out.println("Tebrikler******");
                break;
            }else{
                System.out.println("Tahminiz yanlış!!!");
                System.out.println(3 - counter + " tahmin hakkınız kaldı!!!");
            }
        }while (counter < 3);
        System.out.println("Tuttuğum kelime = " + kelime);
    }
    public static void main(String[] args) {
        menu();
        oyunaBasla();
    }
}
