package gunler.gun31_40.gun32_Arrays2;

import java.util.Arrays;

public class LargestSum {

    public static void main(String[] args) {

        // Verilen 2 arraydeki sayilarin toplami buyuk olan arrayi tespit eden bir method yaziniz

        int[] x = {42,35,86,34,23,87,34};
        int[] y = {32,35,36,34,33,37,34,45423};

        bigger(x,y);

    }

    public static void bigger(int[] arr1, int[] arr2){
        int sum1 = 0;
        int sum2 = 0;

        for(int arr : arr1){
            sum1 += arr;
        }

        for(int arr : arr2){
            sum2 += arr;
        }

        // Arrays.toString(array);

        if(sum1>sum2){
            System.out.println(Arrays.toString(arr1) + " is bigger");
        }else if(sum2>sum1){
            System.out.println(Arrays.toString(arr2) + " is bigger");
        }else{
            System.out.println(Arrays.toString(arr1) + " and " + Arrays.toString(arr2) + " are equal");
        }
    }
}