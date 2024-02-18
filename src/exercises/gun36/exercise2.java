package exercises.gun36;

import java.util.ArrayList;
import java.util.Scanner;

public class exercise2 {
    //Array kabul eden bir method yazın,method array deki en küçük sayıyı bulup
    //diğer elemanların yerine yazsın,bize yeni array i dönsün
    //örn: int x={5,6,9}; ----> [9,9,9]
    // int a={136,76,9,-15,2500}; ---->[2500,2500,2500,2500,2500]
    // System.out.println(Arrays.toString(min(x)));
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("5 adet değer giriniz : ");
        for (int i = 0; i < 5; i++) {
            int sayi = scanner.nextInt();
            numbers.add(sayi);
        }
        System.out.println("numbers : " + numbers);

        asdf(numbers);
    }
    public static void asdf (ArrayList<Integer> num){
        int smallest = num.get(0);

        for (int i =0;i<num.size();i++){
            if (num.get(i)<smallest){
                smallest= num.get(i) ;
            }
        }
        for (int i =0;i<num.size();i++){
            if (num.get(i)!=smallest){
                num.set(i, smallest);
            }
        }
        System.out.println(num.toString());
    }
}

