package exercises.gun29;

import java.util.Scanner;

public class homework3 {
    // Write a program that ask user to enter his/her firstname and lastname.
    // Display each character of full name in the console.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your Firstname : ");
        String firstName = scanner.nextLine();

        System.out.println("Please enter your Lastname : ");
        String lastName = scanner.nextLine();

        String fullname = firstName.concat(lastName);
        System.out.println("your fullname is : " + fullname);

        for (int i=0;i<firstName.length();i++){
            System.out.println(firstName.charAt(i));
        }
        System.out.println();
        for (int i=0;i<lastName.length();i++){
            System.out.println(lastName.charAt(i));
        }
    }
}
