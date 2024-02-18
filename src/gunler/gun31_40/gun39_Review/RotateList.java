package gunler.gun31_40.gun39_Review;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4, 8, 9, 2, 5, 1, 67, 6, 3, 11, 43, 0, 2, 32, 44));
        rotate(numbers);
    }

    public static void rotate (ArrayList<Integer> num){
        int smallest = num.get(0);

        for (int i =0;i<num.size();i++){
            if (num.get(i)<smallest){
                smallest= num.get(i) ;
            }
        }
        num.remove(Integer.valueOf("0"));
        num.add(0,smallest);
        System.out.println(num.toString());
    }

}
/*public static void main(String[] args) {

        // Verilen liste icerisindeki en kucuk degere sahip olan elementi tespit edip, ilk siraya tasiyan bir method yaziniz

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(35,76,23,21,12,56,34,38,567,233));

        minToStart(numbers);

    }

    public static void minToStart(ArrayList<Integer> list){
        int min = Integer.MAX_VALUE;
        int pos = -1;

        for(int i=0; i<list.size(); i++){
            if(list.get(i) < min){
                min = list.get(i);
                pos = i;
            }
        }

        list.remove(pos);
        list.add(0, min);

        System.out.println(list.toString());
    } */