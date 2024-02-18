package gunler.gun31_40.gun31_Arrays;
import java.util.Scanner;
public class UrunAra {


        public static void main(String[] args) {

            // Kullanicidan bir urun alarak, urunun listede olup olmadigini bildiren bir program yaziniz

            String [] urunler = {"Elma", "Armut", "Muz", "Karpuz", "Seftali"};

            System.out.println("Lutfen aradiginiz urunu giriniz!");
            Scanner sc = new Scanner(System.in);
            String arananUrun = sc.nextLine();

            boolean flag = false;

            for(int i=0; i<urunler.length; i++){
                if(urunler[i].toUpperCase().equals(arananUrun.toUpperCase())){
                    flag = true;
                    break;
                }
            }

            if(flag){
                System.out.println("Aradiginiz urun mevcuttur.");
            }else{
                System.out.println("Aradiginiz urun mevcut degildir.");
            }

        }
    }

