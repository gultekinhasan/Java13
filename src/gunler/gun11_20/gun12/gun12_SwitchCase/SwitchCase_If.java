package gunler.gun11_20.gun12.gun12_SwitchCase;

import java.util.Scanner;

public class SwitchCase_If {
    public static void main(String[] args) {
        System.out.println("Switch case ---> If statement in Java.");
        Scanner veriGir = new Scanner(System.in);
        int day = 9;
        String dayString = "";
        String dayType = "";

        System.out.print("Klavyeden bir gün bilgisi giriniz : ");
        day = veriGir.nextInt();

    if (day>0 && day<=7){
        if (day==1){
            dayString= "Monday";
        }
        if (day==2){
            dayString= "Tuesday";
        }
        if (day==3){
            dayString= "Wednesday";
        }
        if (day==4){
            dayString= "Thursday";
        }
        if (day==5){
            dayString= "Friday";
        }
        if (day==6){
            dayString= "Saturday";
        }
        if (day==7){
            dayString= "Sunday";
        }
        System.out.println(" It's " + dayString + "." );
        if (day>=1 && day<=5){
            dayType = "Week day";
            System.out.println("and it's a" + dayType);
        }else {
            System.out.println("and it's weekend");
        }
    } else {
        System.out.println("Invalid day");
    }

    }
}
