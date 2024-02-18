package exercises;

import java.util.ArrayList;
import java.util.Scanner;
public class replit_26_11 {
    //Given sorted array, print the number that’s closest to the key
    //Input:
    //``(1,3,5,9,11), 6``
    //Output:
    //``5``

    //Input:
    //``(1,3,5,9,11), 10 ``
    //Output:
    //``9 , 11``
    // verilen Key Arrayin hangi elemanina daha yakindir.....



    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int hedefSayi;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen hedef sayiyi giriniz");
        hedefSayi = scanner.nextInt();

        System.out.println("5 adet değer giriniz : ");
        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            numbers.add(number);
        }
        System.out.println(numbers + " , " + hedefSayi);
        System.out.println();

        int smallestAbs = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
           if ((Math.abs(hedefSayi-numbers.get(i)))<=(Math.abs(hedefSayi-smallestAbs))){
               System.out.println(numbers.get(i));
           }
        }
       /*  for (int i = 0; i < numbers.size(); i++) {
            if (Math.abs(hedefSayi - numbers.get(i)) == Math.abs(hedefSayi - smallestAbs)) {
                System.out.println(numbers.get(i));
            }
        }*/
   }
}

