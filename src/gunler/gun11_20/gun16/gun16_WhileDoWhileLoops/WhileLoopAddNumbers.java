package gunler.gun11_20.gun16.gun16_WhileDoWhileLoops;

import java.util.Scanner;

public class WhileLoopAddNumbers {
    public static void main(String[] args) {
        // 1-10 aralığındaki sayıların toplamını ekrana
        // yazdıran programı while döngüsü kullanarak yazınız.

        int toplam = 0;
        int i = 1;
        while (i<10){
            toplam += i;
            i++;
        }
        System.out.println("toplam = " + toplam);


        System.out.println();
       //Klavyeden girilen bir tamsayıya kadar olan tam sayıların toplamını ekrana yazdıran bir program yazınız.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Klavyeden üst limit için bir tam sayı giriniz : ");
        int ustLimit = scanner.nextInt();
        int sum =0;
        int j= 1;
        while (j<ustLimit){
            sum += j;
            j++;
        }
        System.out.println(sum);
    }
}
