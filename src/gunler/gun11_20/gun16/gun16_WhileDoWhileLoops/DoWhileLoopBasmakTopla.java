package gunler.gun11_20.gun16.gun16_WhileDoWhileLoops;
import java.util.Scanner;
public class DoWhileLoopBasmakTopla {
    public static void main(String[] args) {
        //Klavyeden girilen bir tam sayının basamaklarının toplamını ve basamak bilgisini ekrana yazdıran bir program yazınız.
        Scanner input = new Scanner(System.in);
        int sayi = 0;
        int rakam = 0;
        int basamak = 0;
        int toplam = 0;

        System.out.print("Klavyeden bir tamsayı giriniz : ");
        sayi = input.nextInt();
        //While loop ile de yapılabilir.
        do {
            basamak++;
            rakam = sayi % 10; //son basamağı al
            toplam += rakam; // basmakları topla
            sayi = sayi/10; //basmağı sayıdan at

            switch (basamak){
                case 1:
                    System.out.println("Birler basamağı = " + rakam);
                    break;
                case 2:
                    System.out.println("Onlar basamağı = " + rakam);
                    break;
                case 3:
                    System.out.println("Yüzler basamağı = " + rakam);
                    break;
                case 4:
                    System.out.println("Binler basamağı = " + rakam);
                    break;
                case 5:
                    System.out.println("Onbinler basamağı = " + rakam);
                    break;
                default:
                    System.out.println("Hatalı basamak");
                    break;
            }
        } while (sayi > 0);

        System.out.println("Basamakların Toplamı : " + toplam);

    }
}
