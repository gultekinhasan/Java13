package gunler.gun31_40.gun32_Arrays2;

import java.util.Arrays;

public class homework1 {
    public static void main(String[] args) {
        int[] x = {1,2,3};

        System.out.println("x: " + Arrays.toString(x));

        int[] largest = new int[]{formul(x)};
        System.out.println(Arrays.toString(largest));
    }
    public static int formul(int... arr) {
        int largest = arr[0];
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }

        }
        return largest;
    }
}
