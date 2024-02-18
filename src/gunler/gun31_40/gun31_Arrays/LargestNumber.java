package gunler.gun31_40.gun31_Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int[] numbers = {263, 3466, 4671, 835, 3356, 8357, 2564, 967, 2343, 6547};

        int largest = numbers[0];
        int position = 0 ;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>largest) {
                largest=numbers[i];
                position = i;
            }
        }
        System.out.println("Listedeki " + (position + 1) + ". siradaki "+ largest + " en buyuk sayidir.");
    }
}
