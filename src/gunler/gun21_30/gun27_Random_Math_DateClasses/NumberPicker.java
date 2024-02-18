package gunler.gun21_30.gun27_Random_Math_DateClasses;
import java.util.Random;
import java.util.Scanner;
public class NumberPicker {
    public static void main(String[] args) {

        System.out.println("Pick a number between 1 - 10");
        Scanner sc = new Scanner(System.in);
        int pickedNumber = sc.nextInt();

        System.out.println("This program generates numbers between 1 to 10 until a picked number is found");
        Random random = new Random();

        int attempts = 0;
        while(true){

            int targetNumber = random.nextInt(10) + 1;
            System.out.println("targetNumber = " + targetNumber);

            attempts++;
            if(pickedNumber == targetNumber){
                System.out.println("Your number came up after " + attempts + " times attempt");
                break;
            }
        }

    }

}
