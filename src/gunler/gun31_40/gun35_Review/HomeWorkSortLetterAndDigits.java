package gunler.gun31_40.gun35_Review;
import java.util.Arrays;

public class HomeWorkSortLetterAndDigits {
    public static String analyzeString(String str) {
    /*
        Input : "DC501GCCCA098911"
        Output: "DC,501,GCCCA,098911"

         ALGORITMA:
        ---------------------------------------
         1-result isminde bir String değişken oluştur.String'ten bir karakter oku ve result değşkenine ekle
         2-Karakter letter ise sonraki karaktere bak. Eğer sonraki karakter digit ise result değişkenine "," ekle
         3-Karakter digit ise sonraki karaktere bak. Eğer sonraki karakter letter ise result değişkenine "," ekle
         4-1 adımdan itibaren String' te okunacak harf kalmayıncaya dek tekrar et.
         5-result değişkenini return et
     */
        System.out.println("Input :" + str);
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i);
            if(Character.isLetter(str.charAt(i)) && i < str.length()-1){
                if(Character.isDigit(str.charAt(i + 1))){
                    result += ",";
                }
            }
            if(Character.isDigit(str.charAt(i)) && i < str.length()-1  ){
                if(Character.isLetter(str.charAt(i + 1))){
                    result += ",";
                }
            }
        }
        return result;
    }
    public static String sortStr(String str) {
        /*
         Input : "DC,501,GCCCA,098911"
         Output: "CD015ACCCG011899"
         ALGORITMA:
         ---------------------------------------
         1-Parametre olarak gelen str değişkenini "," ayracını kullanarak String Array'e dönüştür.
         2-String Array'den bir eleman oku ve char[] arraye dönüştür
         3-Array.sort() metodunu kullanarak char[] array den okuduğun elemanı kendi içinde sirala
         4-Sıralanan elemanı(string) result değişkenine ekle
         5-2 adımdan itibaren String Array'de okunacak eleman kalmayıncaya dek adımları tekrar et.
         6- result değşkenini return et.
         */
        String result = "";
        String[] arr = str.split(",");
        for (String eleman : arr) {
            char[] chars = eleman.toCharArray();
            Arrays.sort(chars);
           /* for (char harf :chars){
                result += harf;
            }*/
            result += new String(chars);
        }
        return result;
    }

    public static void main(String[] args) {
         /*
        Problem:
            Input : "DC501GCCCA098911"
            OutPut: "CD015ACCCG011899"
         */

       /* String str = "DC,501,GCCCA,098911";
        System.out.println(sortStr(str));*/
        //      System.out.println("Output:" +  analyzeString("DC501GCCCA098911"));

        String strAnaliz = analyzeString("DC501GCCCA098911"); //return string is : "DC,501,GCCCA,098911"
        System.out.println("Output:" + sortStr(strAnaliz)); //return string is : "CD015ACCCG011899"
    }
}
