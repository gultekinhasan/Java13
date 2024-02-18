package exercises.gun36;
import java.util.Scanner;
import java.util.ArrayList;

public class gun36_odev {
    public static void main(String[] args) {
        //Bir Arraylist kabul eden bir method yaziniz, bu method listede yer alan en buyuk sayiyi tespit ederek,
        // listedeki tum diger degerleri bu sayiya update eden bir code yaziniz.
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
        int largest = num.get(0);

        for (int i =0;i<num.size();i++){
            if (num.get(i)>largest){
                largest= num.get(i) ;
            }
        }
        for (int i =0;i<num.size();i++){
            if (num.get(i)!=largest){
                num.set(i, largest);
            }
        }
        System.out.println(num.toString());
    }
}
