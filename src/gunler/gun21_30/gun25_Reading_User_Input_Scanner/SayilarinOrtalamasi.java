package gunler.gun21_30.gun25_Reading_User_Input_Scanner;
import java.util.Scanner;

public class SayilarinOrtalamasi {
    public static void main(String[] args) {
        //Create a Scanner Object
        Scanner input = new Scanner(System.in);
        //Kullanıcıdan 3 adet double türünde sayı girmesini isteyin
        System.out.print("Üç adet double türünde sayı giriniz : ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        //Calculate average
        double average = (number1 + number2 + number3 ) / 3;

        //Display results
        System.out.println("The average of "
                + number1 + ", " + number2 + ", " + number3 + " is " + average);
    }
}
