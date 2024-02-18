package gunler.gun21_30.gun21_Review;

public class ReverseInteger {
    public static int reverse(int sayi){
        int reverseSayi = 0;

        while (sayi > 0){
            reverseSayi = reverseSayi * 10 + sayi % 10; //sayının son basamağını alıp reverseSayının ilk basmağı yapıyoruz
            sayi = sayi / 10; //sayıdan son basamağı çıkartıryoruz.
        }
        return reverseSayi;
    }

    public static void main(String[] args) {
        int sayi = 1221;

        System.out.println("reverse(sayi) = " + reverse(sayi));

        //Palindrome sayı---> sayı ile sayının tersi aynı ise bu sayılara palindrome denir
        if (sayi == reverse(sayi)){
            System.out.println("Sayı palindrome'dur.");
        }else System.out.println("Sayı palindrome değildir.");
    }
}
