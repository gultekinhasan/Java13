package exercises.gun29;

public class etut {
    public static String ekle (String str) {
        if (str.length() >= 2) {
            return str.substring(2).concat(str.substring(0,2));
        }else{
            return "İsminiz iki kelimeden az olamaz";
        }
    }
    public static void main(String[] args) {
        String str ="Hasan";
        System.out.println("ekle(str) = " + ekle(str));
    }
}
