package gunler.gun11_20.gun19.gun19_Methods1;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        System.out.println("Main method");
        convert();
        System.out.println("Back to Main method");
    }
    public static void convert(){
        System.out.println("convert method");
        calculation();
        System.out.println("Back to numbers method");
    }
    public static void calculation(){
        Scanner scanner =  new Scanner(System.in);
        double celsius;
        double fahrenheit;
        System.out.println("Plese write the celsius degree ;");
        celsius = scanner.nextDouble();

        fahrenheit = (celsius * 1.8) + 32;
        System.out.println(celsius + " celsius is equal to  " + fahrenheit + " fahrenheit.");
    }

}
