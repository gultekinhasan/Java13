package gunler.gun31_40.gun39_Review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FilterRange {

    public static void main(String[] args) {

        // Liste icerisindeki sayilari verilen range araliginda filtreleyen bir method yaziniz
        // filterRange(list,3,7);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4, 8, 9, 2, 5, 1, 67, 6, 3, 11, 43, 0, 2, 32, 44));
        filterRange(numbers, 3,7);
    }

    public static void filterRange(ArrayList<Integer> list, int min, int max){

        ArrayList<Integer> temp = new ArrayList<>();

        for(Integer n : list){
            if(n < min || n > max){
                temp.add(n);
            }
        }

        list.clear();
        list.addAll(temp);

        System.out.println(list.toString());
    }
}
