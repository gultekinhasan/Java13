package gunler.gun11_20.gun13.gun13_TernaryOperator;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int age;
        String name, hire;
        boolean bachelor;

        System.out.print("Please write your name below : ");
        name = scanner.next()+ " "+ scanner.next();

        System.out.print("Please write your age below  : ");
        age = scanner.nextInt();

        System.out.print("Please write 'true' if you are graduated from University, if not please write 'False' : ");
        bachelor = scanner.nextBoolean();

        hire = (bachelor && age>18 && age<40 ) ? "hired": " not hired ";
        System.out.println("Hi " + name + " you're " + hire + " as a QA Engineer.");
    }
}
/* write a program that accepts name, age and checks if a candidate is selected for job by using ternary operator.
    sample 1: Hi Ahmet Yilmaz you're selected as QA Engineer.
    sample 2 : Hi Ahmet Yilmaz you're not selected as QA Engineer.
     */