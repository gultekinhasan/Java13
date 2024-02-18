package gunler.gun11_20.gun12.gun12_SwitchCase;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*
        Write a program that lets user to enter Mercedes, Volvo, Opel, Sahin Car Models

            If it is Mercedes display “Good one”
            If it is Volvo display “Tough one”
            If it is Opel display “Not bad”
            If it is Sahin display “Not recommended”
            Else “Do not buy that one!”
         */
        System.out.print("PLEASE ENTER YOUR CAR MODEL : ");
        String car = scanner.next();
        String describe = "";

        switch (car) {
            case "mercedes" -> describe = "GOOD ONE";
            case "volvo" -> describe = " THOUGH ONE";
            case "opel" -> describe = " NOT BAD ";
            case "sahin" -> describe = " NOT RECOMMENDED ";
            default -> System.out.println("DO NOT BUY THAT ONE!!");
        }if (car != " "){
            System.out.println(describe);
        }

    }
}
