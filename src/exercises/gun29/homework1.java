package exercises.gun29;
import java.util.Scanner;
public class homework1 {
    //Write a program that ask user to enter his/her firstname and lastname. Display the number
    //of characters by assigning a variable.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your Firstname : ");
        String firstName = scanner.nextLine();

        System.out.println("Please enter your Lastname : ");
        String lastName = scanner.nextLine();

        String fullname = firstName.concat(lastName);
        System.out.println("your fullname is : " + fullname);


        System.out.println("lenght" + fullname.length());
    }
}
