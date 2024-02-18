package gunler.gun11_20.gun12.gun12_SwitchCase;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         /*
    Write a program to display traffic light colors using following logic:

        if code (R/r)—>"Red"
        if code (A/a)—>"Amber"
        if code (G/g)—>"Green"
     */
        System.out.print("Please write down the first letter of Traffic Light : ");
        String harf = scanner.next();
        String kelime = "";

        switch (harf){
            case "R", "r" :
                kelime = "Red";
                break;
            case "A","a":
                kelime = "Amber";
                break;
            case "G","g":
                kelime = "Green";
            default:
                System.out.println("Invalid Word!");
        }
        if (kelime!=""){
            System.out.println(kelime);
        }



    }
}
