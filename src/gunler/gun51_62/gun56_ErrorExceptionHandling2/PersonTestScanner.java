package gunler.gun51_62.gun56_ErrorExceptionHandling2;

import gunler.gun51_62.gun56_ErrorExceptionHandling2.Exceptions.AddressException;
import gunler.gun51_62.gun56_ErrorExceptionHandling2.Exceptions.AgeException;
import gunler.gun51_62.gun56_ErrorExceptionHandling2.Exceptions.NameException;
import java.util.Scanner;

public class PersonTestScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();

        String name;
        int age;
        String address;

        while (true) {
            System.out.print("İsminizi giriniz : ");
            name = scanner.nextLine();
            try {
                person.setName(name);
                break;
            } catch (NameException e) {
                System.out.println("Hata : " + e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        while (true) {
            System.out.print("Yaş bilginizi giriniz : ");
            try {
                age = Integer.parseInt(scanner.nextLine()); //It may throw NumberFormatException there for catch block for this exception may be created
                person.setAge(age);
                break;
            } catch (AgeException | NumberFormatException ae) { //Benzer exception'lar aynı catch block içerisinde | (or) opertörü ile yazılabilir
                System.out.println("Hata : " + ae.getMessage());
            } /*catch (NumberFormatException nfe){
                System.out.println("Hata : " + nfe.getMessage());
            }*/
        }
        while (true) {
            System.out.print("Adres bilgisini giriniz : ");
            address = scanner.nextLine();
            try {
                person.setAddress(address);
                break;
            } catch (AddressException adre) {
                System.out.println("Hata: " + adre.getMessage());
            }
        }
        System.out.println(person);
    }
}
