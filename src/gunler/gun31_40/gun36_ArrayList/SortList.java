package gunler.gun31_40.gun36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(99,23,15,45,34,235,1,32));
        System.out.println(numbers.size());
        System.out.println(numbers.toString()); // [99,23,15,45,34,235,1,32]

        //How to sort the list by ascending order

                Collections.sort(numbers);

                System.out.println(numbers.toString()); // [1, 15, 23, 32, 34, 45, 99, 235]

   }
}

