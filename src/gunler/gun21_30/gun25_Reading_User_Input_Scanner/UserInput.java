package gunler.gun21_30.gun25_Reading_User_Input_Scanner;
import java.util.Scanner; //imports only Scanner class

public class UserInput {
    public static void main(String[] args) {
        System.out.println("User Inputs in Java.");
        Scanner klavye = new Scanner(System.in);
        System.out.print("Klavyeden isminizi giriniz : ");
        klavye.nextLine();
    }
}
