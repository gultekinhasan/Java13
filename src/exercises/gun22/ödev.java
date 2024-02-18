package exercises.gun22;

import java.util.Scanner;

public class ödev {
    //Odev: Kullanicidan yaricap degeri alarak, bir dairenin alan ve cevresini
    // Math class methodlari ile hesaplayan ayri methodlar olusturunuz?
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Daire Yarıçapını giriniz : ");
        double r = scanner.nextDouble();
        alan(r);
        cevre(r);

        System.out.println("alan = " + alan(r));
        System.out.println("cevre = " + cevre(r));

    }
    public static double alan(double r) {
        double alan = Math.PI * Math.pow(r,2);
        return alan;
    }
    public static double cevre(double r) {
        double cevre = 2 * Math.PI * r;
        return cevre;
    }
}
