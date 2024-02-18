package gunler.gun31_40.gun39_Review;

import java.util.ArrayList;

public class ArrayListReview {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);
        numberList.add(50);

        System.out.println("numberList = " + numberList);

        System.out.println(numberList.toString());

        System.out.println(numberList.size());

        System.out.println(numberList.isEmpty());

        for (int i=0;i<numberList.size();i++){
            System.out.println(numberList.get(i) + "");
        }
        System.out.println();

        for (Integer number : numberList){
            System.out.println(number);
        }

        numberList.add(4,45);
        System.out.println(numberList);
        System.out.println();
        numberList.set(4,46);
        System.out.println(numberList);
        System.out.println();
        numberList.remove(4);
        System.out.println(numberList);
        System.out.println();
        numberList.remove(Integer.valueOf(50));
        System.out.println(numberList);
        System.out.println();
        System.out.println(numberList.contains(40));
        System.out.println();
        numberList.clear();
        System.out.println(numberList);


    }
}
