package gunler.gun1_10.gun08.gun08_Assignment_Relational_LogicalOperators;


public class BasamaklaraAyirma {

    public static void main(String[] args) {

        // Verilen bir sayiyi basamaklarina ayirarak yazdiran bir kod yaziniz
        int sayi = 2367;
        int birler, onlar, yuzler, binler;

        birler = sayi % 10; // 7
        sayi /= 10; // 236

        onlar = sayi % 10; // 6
        sayi /= 10; // 23

        yuzler = sayi % 10; // 3
        sayi /= 10; // 2

        binler = sayi % 10; // 2

        System.out.println("birler = " + birler);
        System.out.println("onlar = " + onlar);
        System.out.println("yuzler = " + yuzler);
        System.out.println("binler = " + binler);

    }
}
