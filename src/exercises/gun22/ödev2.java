package exercises.gun22;
import java.util.Scanner;
public class ödev2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yarıçap değerini giriniz : ");
        double yaricapDegeri = scanner.nextDouble();
        alan(yaricapDegeri);
        cevre(yaricapDegeri);
    }
    public static void alan (double yaricapDegeri){

        double alan = Math.PI*Math.pow(yaricapDegeri,2);
        System.out.println("Dairenin alanı = " + alan);
    }
    public static void cevre(double yaricapDegeri){
        double cevre = 2*Math.PI*yaricapDegeri;
        System.out.println("Dairenin cevresi = " + cevre);
    }
}


