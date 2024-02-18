package gunler.gun11_20.gun20.gun20_Methods2;

import java.util.Scanner;
    public class UniqueNumber2 {

        public static void main(String[] args) {

            // Verilen 3 sayi icerisinde kac farkli sayi oldugunu bulan bir method yaziniz

            Scanner sc = new Scanner(System.in);

            int num1, num2, num3;

            System.out.println("Lutfen 1. sayiyi giriniz!...");
            num1 = sc.nextInt();

            System.out.println("Lutfen 2. sayiyi giriniz!...");
            num2 = sc.nextInt();

            System.out.println("Lutfen 3. sayiyi giriniz!...");
            num3 = sc.nextInt();


            int uniqueNumber = uniqueNumber(num1,num2,num3);
            System.out.println("uniqueNumber = " + uniqueNumber);


//        int sonuc = uniqueNumber(1,2,3);
//
//        System.out.println("sonuc = " + sonuc);
        }

        public static int uniqueNumber(int a, int b, int c){

            int sonuc = 0;

            if(a == b && b == c){
                sonuc = 1;
            }else if(a == b || a == c || b == c){
                sonuc = 2;
            }else{
                sonuc = 3;
            }

            return sonuc;

            // sonuc = a == b && b == c ? 1 : a == b || a == c || b == c ? 2 : 3;

            // System.out.println("Farkli sayi adedi " + sonuc + " dur");

        }
    }

