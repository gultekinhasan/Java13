package gunler.gun21_30.gun28_StringClass_1;
import java.util.Random;

public class AskingCharOfString {
    public static String harfSor(String str){
        Random random = new Random();
        int harfIndex = random.nextInt(str.length());
        String resulStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == harfIndex){
                resulStr += str.charAt(harfIndex);
                continue;
            }
            resulStr += "*";
        }
        return resulStr;
    }
    public static void main(String[] args) {
        String kelime = "";
        kelime = harfSor("hasan");
        System.out.println("kelime = " + kelime);
    }
}
