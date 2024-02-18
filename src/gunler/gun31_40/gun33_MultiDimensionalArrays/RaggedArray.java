package gunler.gun31_40.gun33_MultiDimensionalArrays;
import java.util.Arrays;

public class RaggedArray {
    public static void main(String[] args) {
        //Düzensiz array--- Satırlarındaki sütün(eleman) sayıları birbirinden farklı olabilen diziler
        int[][] triangleArray = new int[5][]; //Ragged array. 5 rows length every row may have different columns size

        triangleArray[0] = new int[5];
        triangleArray[1] = new int[4];
        triangleArray[2] = new int[3];
        triangleArray[3] = new int[2];
        triangleArray[4] = new int[1];

        System.out.println(Arrays.deepToString(triangleArray));

        for (int satir = 0; satir < triangleArray.length ; satir++) {
            //System.out.println(triangleArray[satir].length);
            for (int sutun = 0; sutun < triangleArray[satir].length; sutun++) {
                System.out.print(triangleArray[satir][sutun] + " ");
            }
            System.out.println();
        }
    }
}
