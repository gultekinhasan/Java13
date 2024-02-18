package exercises.gun29;

import java.util.Scanner;

public class homework7 {
    public static void main(String[] args) {

    }

    public static void gecerliMi(String kullanici, String kullaniciSifre) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        kullanici = scanner.nextLine();
        System.out.print("Enter your password: ");
        kullaniciSifre = scanner.nextLine();

        if (kullanici.equals("Ahmet") && kullaniciSifre.equals("12345")) {
            System.out.println("User Logged in successfully");
        } else {
            System.out.println("UserName or password is not valid. Please verify");
        }
    }
}
























/*

        Create a Login Functionality according to following Logic
• UserName,Password
• --- > Program will ask to enter username and password
• --- > If both username and password are blank
• "UserName and Password Fields cannot be empty”
• --- > If userName is blank and password is not blank
• "UserName cannot be empty”
• --- > If userName is not blank and password is blank
• "Password cannot be empty”
• --- > If the username or password is not valid
• "UserName or password is not valid. Please verify”
• --- > If the username and password are both valid
• “User Logged in successfully"


     */