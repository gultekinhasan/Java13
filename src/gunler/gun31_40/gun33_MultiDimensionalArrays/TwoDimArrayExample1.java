package gunler.gun31_40.gun33_MultiDimensionalArrays;
import java.util.Arrays;

public class TwoDimArrayExample1 {
    public static void main(String[] args) {
        //Each row of two dim array is also an array
        System.out.println("Two dimensional array in Java.");
        //                       row col
        int[][] numbers = new int[3][3]; // numbers[rows][columns] ---> 3 * 2 = 6 elemanlı bir dizi

        //           0  1  2
        // 0- satır  0  0  0
        // 1- satır  0  0  0
        // 2- satır  0  0  0

        numbers[0][0] = 1; // Assigning value to two dim array numbers[row][column] by their index
        numbers[0][1] = 3; // Assigning value to two dim array numbers[row][column] by their index
        numbers[0][2] = 6; // Assigning value to two dim array numbers[row][column] by their index

        //Each row of two dim array is also an array
        int[] birArray = {23, 56, 5};
        numbers[1] = birArray;
        numbers[2] = new int[]{12, 67, 90};

        //int[][] sayilar = new int[4][3];
        int[][] sayilar = { //Creating two dim array with literal values
                {1, 2, 3},
                {34, 56, 89},
                {3, 6, 9},
                {45, 76, 1}
        };

        System.out.println("birArray[] " + Arrays.toString(birArray));
        System.out.println("sayilar[1] = " + Arrays.toString(sayilar[1]));

        System.out.println("Arrays.deepToString(sayilar) = " + Arrays.deepToString(sayilar));
        System.out.println("Arrays.deepToString(numbers) = " + Arrays.deepToString(numbers));
        System.out.println();
        //For .... loop ile
        System.out.println("For loop ile.....");
        for (int i = 0; i < birArray.length; i++) {
            System.out.println("birArray[i] = " + birArray[i]);
        }

        //satırları dolaşır
        for (int i = 0; i < numbers.length; i++) { //numbers.length gives the row number of two dim array
            //sütünları dolaşır
            for (int j = 0; j < numbers[i].length ; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}