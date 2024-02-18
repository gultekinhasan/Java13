package gunler.gun11_20.gun13.gun13_TernaryOperator;

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        String text;

        System.out.print("Write the number to check if it's even or odd : ");
        number = scanner.nextInt();

        text = (number%2==0)? " Number is even" : " Number is Odd";
        System.out.println(number + text);
    }
}
/*
    write a program to display whether the number is an odd number or even number by using ternary operator.
    sample : 331341 is odd number
  */