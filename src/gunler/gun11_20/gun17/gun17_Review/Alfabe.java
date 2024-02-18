package gunler.gun11_20.gun17.gun17_Review;

public class Alfabe {
    // alfabenin bütün harflerini loop kullanarak yazdırınız
    public static void main(String[] args) {
        char harf;
        int intharf;
        for (harf='a'; harf<='z';harf++){
            intharf=harf;
            System.out.println(intharf+ " == " + harf);
        }
    }
}
