package gunler.gun11_20.gun12.gun12_SwitchCase;
import java.util.Scanner;

public class AdvancedSwitchCase {
    public static void main(String[] args) {
        System.out.println("Switch case statement in Java.");
        System.out.println("Printing day of week.");
        Scanner veriGir = new Scanner(System.in);

        int day = 7;
        String dayString =" ";

        System.out.print("Klavyeden bir gün(1-7) bilgisi giriniz : ");
        day = veriGir.nextInt();

        switch (day) {
            case 1:
                dayString = "Pazartesi";
                System.out.println("Case 1 is invoked.");
                break;
            case 2:
                dayString = "Salı";
                break;
            case 3:
                dayString = "Çarşamba";
                break;
            case 4:
                dayString = "Perşembe";
                break;
            case 5:
                dayString = "Cuma";
                break;
            case 6:
                dayString = "Cumartesi";
                break;
            case 7:
                dayString = "Pazar";
                break;
            default:
                System.out.println("Geçersiz gün bilgisi!!!");
                // break;
        }
        if (dayString != " ") {
            System.out.println("Haftanın " + dayString + " günü.");
        }
        System.out.println();

        // Advanced switch case
        System.out.println("Advanced switch case....");
        System.out.println("----------------------------");
        switch (day) {
            case 1 -> dayString = "Pazartesi";
            case 2 -> dayString = "Salı";
            case 3 -> dayString = "Çarşamba";
            case 4 -> dayString = "Perşembe";
            case 5 -> dayString = "Cuma";
            case 6 -> dayString = "Cumartesi";
            case 7 -> dayString = "Pazar";
            default -> System.out.println("Gün bilgisi 1-7 aralığında olmalıdır!!!");
        }
        if (dayString != "") {
            System.out.println("Haftanın " + dayString + " günü.");
        }
        //Gruplandırılmış switch case
        System.out.println("Advenced switch case...");
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Haftaiçi günüdür.");
            case 6, 7 -> System.out.println("Haftasonu günüdür.");
            default -> System.out.println("Gün bilgisi 1-7 aralığında olmalıdır!!!");
        }

        System.out.println("if else....");
        if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
            System.out.println("Haftaiçi günüdür.");
        } else if (day == 6 || day == 7) {
            System.out.println("Haftasonu günüdür.");
        } else System.out.println("Gün bilgisi 1-7 aralığında olmalıdır!!!");
    }
}