package gunler.gun11_20.gun19.gun19_Methods1;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("Main method");
        numbers();
        System.out.println("Back to Main method");
    }
    public static void numbers(){
        System.out.println("Numbers method");
        calculation();
        System.out.println("Back to numbers method");
    }
    public static void calculation(){
        Scanner scanner =  new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int toplam;
        System.out.println("Plese write the 1. number ;");
        num1 = scanner.nextInt();
        System.out.println("Plese write the 2. number ;");
        num2 = scanner.nextInt();
        System.out.println("Plese write the 3. number ;");
        num3 = scanner.nextInt();
        toplam = num1+num2+num3;
        System.out.println("toplam = " + toplam);
    }
}
