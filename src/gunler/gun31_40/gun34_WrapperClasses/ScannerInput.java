package gunler.gun31_40.gun34_WrapperClasses;
import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Lütfen Yaşınızı giriniz : ");
//        int age = scanner.nextInt();
//
//        scanner.nextLine(); //Hatanın çözümü
//
//        System.out.print("Lütfen adınızı giriniz : ");
//        String name = scanner.nextLine();
//
//        System.out.println(name + " " + age + " yaşındadır.");


        //Wrapper class version

        System.out.print("Lütfen Yaşınızı giriniz : ");
        int age = Integer.parseInt(scanner.nextLine()); //Tercih edilen
        //int age = Integer.valueOf(scanner.nextLine()); //Bu yöntem de kullanılabilir.


        System.out.print("Lütfen kilonuzu giriniz : ");
        double kilo = Double.parseDouble(scanner.nextLine()); //Tercih edilen
        ///double kilo = Double.valueOf(scanner.nextLine()); //Bu yöntem de kullanılabilir.


        System.out.print("Lütfen adınızı giriniz : ");
        String name = scanner.nextLine();

        System.out.println(name + " " + age + " yaşındadır. Ve " + kilo + " kilodur.");

    }
}
