package gunler.gun21_30.gun27_Random_Math_DateClasses;
import java.util.Random;

public class RandomNumbers {


        public static void main(String[] args) {

        Random randomNumber = new Random();

        System.out.println(randomNumber.nextInt());
        System.out.println(randomNumber.nextDouble());
        System.out.println(randomNumber.nextFloat());
        System.out.println(randomNumber.nextBoolean());

        System.out.println(randomNumber.nextInt(10)); // 0 - 9 int random numbers
        System.out.println(randomNumber.nextInt(1)); // only 0 (max-1)
        System.out.println(randomNumber.nextInt(10) + 5); // 5 - 14 int random numbers
        System.out.println(randomNumber.nextInt(1) + 3); // only 3
        System.out.println(randomNumber.nextInt(2) + 1); // 1 or 2
        System.out.println(randomNumber.nextInt(100) - 50); // -50 ==> 49 int random numbers

        int sayi = randomNumber.nextInt(10) + 5;
        System.out.println("sayi = " + sayi);

    }
}
