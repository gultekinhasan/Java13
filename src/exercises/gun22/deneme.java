package exercises.gun22;
import java.util.Scanner;
public class deneme {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Sayiyi girniz : ");
            int num1 = scanner.nextInt();
            System.out.println("2. Sayiyi giriniz : ");
            int num2 = scanner.nextInt();

            System.out.println(lastDigit(num1, num2));

        }
        public static boolean lastDigit(int num1, int num2){
            int lastDigit1 = num1 % 10;
            int lastDigit2 = num2 % 10;

            return lastDigit1 == lastDigit2;
        }
    }
