package gunler.gun21_30.gun28_StringClass_1;

public class StringIsBlankIsEmpty {
    public static void main(String[] args) {
        String str1 = ""; //empty string length = 0 ---> hiçbir şey yok
        String str2 = "             "; // blank string ---> enaz bir adet boşluk(space)

        System.out.println("str1.isBlank() = " + str1.isBlank()); //true
        System.out.println("str1.isEmpty() = " + str1.isEmpty()); //true
        //bir empty string aynı zamanda bir blank stringtir.

        System.out.println("str2.isEmpty() = " + str2.isEmpty()); //false
        System.out.println("str2.isBlank() = " + str2.isBlank()); //true

        //.trim() ---> String in başından ve sonundan boşlukları atar.
        String str3 = "    Merhaba Java    ";
        System.out.println("str3        = " + str3);
        System.out.println("str3.trim() = " + str3.trim());

        str3 = str3.trim();
        System.out.println("str3        = " + str3);
    }
}
