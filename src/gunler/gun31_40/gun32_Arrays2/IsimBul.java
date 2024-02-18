package gunler.gun31_40.gun32_Arrays2;

public class IsimBul {
    public static void main(String[] args) {

        String[] isimler = {"Ahmet", "Mehmet", "Deniz", "Ayse", "Yeliz", "Asya", "Cem"};

        for (String isim : isimler) {
            if (isim.charAt(0) == 'A') {
                System.out.println("isim = " + isim);
            }
        }

        System.out.println("------------------------");

        for (String isim : isimler) {

            if (isim.startsWith("A")) {
                System.out.println("isim " + isim);
            }
        }
    }
}