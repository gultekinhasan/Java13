package gunler.gun11_20.gun14.gun14_ForLoops;

public class Faktoriyel {
    public static void main(String[] args) {
        // verilen bir sayının faktöriyel değerini dinamik olarak bulan bir döngü oluştur

        int sayi= 8;
        int Faktoriyel = 1;
        
        for (int i = 2; i <= sayi; i++) {
            Faktoriyel *= i;
        }
        System.out.println(Faktoriyel);

    }
    }

