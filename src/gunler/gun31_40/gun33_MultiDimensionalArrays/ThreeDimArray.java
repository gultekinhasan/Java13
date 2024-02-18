package gunler.gun31_40.gun33_MultiDimensionalArrays;
import java.util.Arrays;

public class ThreeDimArray {
    public static void main(String[] args) {
        // Create 3 dim array with default values of int daa type.
        int[][][] an3DimArray = new int[3][2][2];
        System.out.println(Arrays.deepToString(an3DimArray));
        System.out.println();
        /*
            ArraySize = 3
            Every row has 1 twoDimArray. Each twoDim array has oneDim array which has two elements
            {
                {{0,0},{0,0}},
                {{0,0},{0,0}},
                {{0,0},{0,0}}
            }
        */


        // Create and assign literal values to 3 dim array. It is also a ragged array
        int[][][] threeDimArray = {
                {
                        {1, 2, 3},
                        {2, 3, 4}
                },
                {
                        {4, 5, 6, 9},
                        {1},
                        {2, 3}
                }
        };

        System.out.println("Size of 3 dim array = " + threeDimArray.length);
        System.out.println("Arrays.deepToString() " + Arrays.deepToString(threeDimArray));
        System.out.println();

        System.out.println("Klasik for loop........");
        for (int threeDimArrayRows = 0; threeDimArrayRows < threeDimArray.length; threeDimArrayRows++) {
            for (int twoDimArrayRows = 0; twoDimArrayRows < threeDimArray[threeDimArrayRows].length; twoDimArrayRows++) {
                for (int oneDimArrayRows = 0; oneDimArrayRows < threeDimArray[threeDimArrayRows][twoDimArrayRows].length; oneDimArrayRows++) {
                    System.out.print(threeDimArray[threeDimArrayRows][twoDimArrayRows][oneDimArrayRows] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        // for...each loop to iterate through elements of 3d array
        System.out.println("Advanced for loop.......");
        for (int[][] twoDimArray : threeDimArray) { //Traverse rows of 3-dim array
            for (int[] oneDimArray : twoDimArray) { //Traverse rows of 2-dim array
                for (int eleman : oneDimArray) { //Traverse columns of 1-dim array
                    System.out.print(eleman + " "); // Prints the value of element
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
