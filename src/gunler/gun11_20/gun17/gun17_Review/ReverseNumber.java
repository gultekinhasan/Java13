package gunler.gun11_20.gun17.gun17_Review;

public class ReverseNumber {
    public static void main(String[] args) {
        // sayiyi ters çeviren bir döngü yazınız.
        // 578252 ==> 252875

        int number = 578252;
        int reversedNumber = 0;

        while (number != 0){
            int digit = number%10;
            reversedNumber = reversedNumber * 10 +digit;
            number/=10;

        }
        System.out.println("reversedNumber = " + reversedNumber);
    }
}
