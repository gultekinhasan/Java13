package gunler.gun21_30.gun29_StringClass2;
import java.util.Scanner;

public class StringContains {
    public static boolean specialCharCheck(String targetStr,String special) {
        boolean result = false;
        for (int i = 0; i < special.length(); i++) {
            if (targetStr.contains(special.charAt(i) + "")) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean isLengthValid(String targetStr, int length) {
        boolean result = true;
        if (targetStr.length() >= length) {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        String sepet = "telefon,bilgisayar,saat,kulaklık";

        System.out.println("sepet.contains(\"saat\") = " + sepet.contains("saat"));

        boolean varMi;
        String search = "bilgisayar";
        varMi = sepet.contains(search);
        if (varMi) {
            System.out.println("Sepette " + search + " var.");
        } else System.out.println("Sepette " + search + "  yok!!!");

        search = "elma";
        varMi = sepet.contains(search);
        System.out.println(search + " varMi? = " + varMi);

        String special = "!?*-+";
        String target = "A*hm-et***?";

        for (int i = 0; i < special.length(); i++) {
            boolean specialVar = target.contains(special.charAt(i) + "");
            if (specialVar) {
                System.out.println(target + " içerisinde " + special.charAt(i) + " özel karakteri mevcut.");
                // break;
            }
        }

        boolean sonuc = specialCharCheck("Ahmet", "*-+?/");
        System.out.println("sonuc = " + sonuc);

        Scanner scanner = new Scanner(System.in);

        boolean strSpecial = true; //özel karakter var durumu.
        boolean strLength = true;
        do {
            System.out.print("Adınızı giriniz : ");
            String name = scanner.nextLine();
            strSpecial = specialCharCheck(name, "*-+?/");
            strLength = isLengthValid(name,3);

        } while (strSpecial || strLength);

    }
}
