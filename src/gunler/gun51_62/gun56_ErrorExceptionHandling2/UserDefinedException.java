package gunler.gun51_62.gun56_ErrorExceptionHandling2;
import gunler.gun51_62.gun56_ErrorExceptionHandling2.Exceptions.AgeException;

import java.util.Scanner;

public class UserDefinedException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = 0;

        while (true) {
            System.out.print("Lütfen yaşınızı giriniz: ");
            age = Integer.parseInt(input.nextLine());
            //age = input.nextInt();

            try {
                if (age <= 18) {
                    //  throw new RuntimeException("Yaş bilgisi 18 den küçük olamaz!!!");
                    throw new AgeException("Yaş bilgisi 18 den küçük olamaz!!!");
                    //System.out.println("Yaş bilgisi 18 den küçük olamaz!!! ");
                } else {
                    System.out.println("Yaşınız araç kullanmaya uygundur.");
                    break;
                }
            } catch (AgeException ae) {
                System.out.println(ae);
            }
        }
    }
}
