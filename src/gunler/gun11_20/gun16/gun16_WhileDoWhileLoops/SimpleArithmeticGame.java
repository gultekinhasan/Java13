package gunler.gun11_20.gun16.gun16_WhileDoWhileLoops;
import java.util.Scanner;
public class SimpleArithmeticGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int soruSayisi= 0;
        int cevap = 0;
        int yanlisCevapSayisi = 0;
        int dogruCevapSayisi = 0;

        System.out.print("Kaç adet soru oluşturmamı istersin ? ");
        soruSayisi = input.nextInt();
        int counter = 0;
        while (counter < soruSayisi){
            int sayi1 = (int) (Math.random() * 10 + 1);
            int sayi2 = (int) (Math.random() * 10 + 1);
            counter++;

            System.out.println(counter + ". soru ---> " + sayi1 + "*" + sayi2 + " = ?");
            System.out.print("Cevabınız --> ");
            cevap = input.nextInt();

            if((sayi1 * sayi2) == cevap){
                System.out.println("Cevabınız doğru");
                dogruCevapSayisi++;
            }else {
                System.out.println("Cevabınız yanlış!!!");
                yanlisCevapSayisi++;
            }
        }
        System.out.println();
        System.out.println("Doğru cevap sayısı  : " + dogruCevapSayisi);
        System.out.println("Yanlış cevap sayısı : " + yanlisCevapSayisi);
    }
}
