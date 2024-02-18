package gunler.gun21_30.gun28_StringClass_1;
import javax.sound.midi.SysexMessage;
import java.util.Scanner;
public class StringLength {
    public static void main(String[] args) {
        //.length() returns the length of the string value
        String str1 = "Merhaba Java";
        System.out.println("str1.length() = " + str1.length());

        String str2 = " "; //Blank string
        String str3 = ""; //Empty string

        System.out.println("str2.length() = " + str2.length());
        System.out.println("str3.length() = " + str3.length());

        Scanner sc = new Scanner(System.in);
        String name = "";

        do {
            System.out.print("Klavyeden adınızı giriniz : ");
            name = sc.nextLine().trim(); //.trim() başındaki ve sonundaki boşlukları siler
            if(name.length() >= 3 && !name.isBlank()){
                break;
            }else System.out.println("Adınız en az 3 harften oluşmalıdır ve boş olmamalıdır!");
        }while (true);

        System.out.println("name = " + name);
        System.out.println("name.length() = " + name.length());
    }

}
