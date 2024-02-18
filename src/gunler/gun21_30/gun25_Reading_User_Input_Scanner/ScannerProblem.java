package gunler.gun21_30.gun25_Reading_User_Input_Scanner;
import java.util.Scanner;
public class ScannerProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Klavyeden yaşınınızı giriniz : ");
        //60 + enter
        int age = input.nextInt(); // Enter a bastığımızda nextInt() integer kısmını okur ve "\n" new line karakteri bufferda kalır
        //age = 60
        //enter ---> newline char in buffer

        //input olarak sayısal bir değerden sonra String tipinde bir değer okunacaksa klavye bufferının boşaltılması gerekir.
        input.nextLine(); //Clears keyboard buffer---Klavye bufferını boşaltır.
        System.out.print("Klavyeden adınızı giriniz   : ");
        String name = input.nextLine();
        System.out.println("Adınız : " + name + " Yaşınız : " + age);


        ///////////////////////////////////////////////////////////
        System.out.print("Adınızı giriniz : ");
        name = input.next(); //Bir kelime okur

        input.nextLine(); //Clears keyboard buffer
        System.out.print("Klavyeden yaşınınızı giriniz : ");
        age = input.nextInt();
        System.out.println("Adınız : " + name + " Yaşınız : " + age);
    }
}
