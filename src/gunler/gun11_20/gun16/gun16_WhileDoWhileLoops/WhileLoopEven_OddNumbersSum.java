package gunler.gun11_20.gun16.gun16_WhileDoWhileLoops;

public class WhileLoopEven_OddNumbersSum {
    public static void main(String[] args) {
        // 0-100 arasındaki çift sayıların toplamı

        int number = 0;
        int toplam = 0;

        while (number<100){
            if (number % 2 == 0){
                toplam += number;
            }
            number++;
        }
        System.out.println("Toplam(çift sayılar) = " + toplam);

        System.out.println("------------------------------------------");

        number=0;
        toplam=0;
        while (number<100){
            if (number % 2 !=0){
                toplam += number;
            }
            number++;
        }
        System.out.println("Toplam(tek sayılar) = " + toplam);
    }
}
