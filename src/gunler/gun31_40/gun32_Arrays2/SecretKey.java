package gunler.gun31_40.gun32_Arrays2;

public class SecretKey {
    public static void main(String[] args) {

        secret("Bazen", "kederler", "sessiz", "degisiklik", "yapmk","kismetsizliginde", "ıslanmak", "istemezsler");
    }
    public static void secret(String... str) {
        String str2 = "";
        int i;
        for (i = 0; i < str.length; i++){
            str2 = str2 + str[i].charAt(i);
        }
        System.out.println(str2);
    }
}
