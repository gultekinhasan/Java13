package gunler.gun1_10.gun08.gun08_Assignment_Relational_LogicalOperators;

public class SwappingTwoNumbers {
    public static void main(String[] args) {

                // Swap given 2 numbers value with each other
                // Verilen 2 degiskenin degerlerini birbiriyle degistiren bir kod yaziniz

                int sayi1 = 12;
                int sayi2 = 33;

                System.out.println("Degerler degismeden once.....");
                System.out.println("sayi1 = " + sayi1);
                System.out.println("sayi2 = " + sayi2);

                // 1. Cozum
                int gecici;
                gecici = sayi1;
                sayi1 = sayi2;
                sayi2 = gecici;

                System.out.println("Degerler degistikten sonra.....");
                System.out.println("sayi1 = " + sayi1);
                System.out.println("sayi2 = " + sayi2);

                // 2. Cozum
                sayi1 += sayi2;
                sayi2 = sayi1 - sayi2;
                sayi1 -= sayi2;

                System.out.println("Degerler degistikten sonra.....");
                System.out.println("sayi1 = " + sayi1);
                System.out.println("sayi2 = " + sayi2);

            }
        }

