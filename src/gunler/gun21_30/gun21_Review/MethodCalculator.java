package gunler.gun21_30.gun21_Review;

import java.util.Scanner;

public class MethodCalculator {

    public static double calculator (int sayi1,int sayi2,String operator) {
        switch (operator) {
            case "+":
                return sayi1 + sayi2;

            case "-":
                return sayi1 - sayi2;
            case "*":
                return sayi1 * sayi2;
            case "/":
                return sayi1 / sayi2;
            default:
                System.out.println("geçersiz operator girdiniz!!!");
                return 0;
        }
    }

        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);

            String operator = " ";
            int sayi1 = 0;
            int sayi2 = 0;

            System.out.println("işlem operatorünü giriniz (+,-.*,/)");
            operator = scanner.nextLine();

            System.out.println("1.sayiyi giriniz = ");
            sayi1 = scanner.nextInt();

            System.out.println("2.sayiyi giriniz = ");
            sayi2 = scanner.nextInt();

            System.out.println(calculator(sayi1,sayi2,operator));
            System.out.println(calculator(40,45,"-"));
            double result = calculator(25,15,"*");
            System.out.println(calculator((int) result,150,"-"));
        }
    }
