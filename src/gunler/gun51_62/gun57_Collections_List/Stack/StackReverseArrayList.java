package gunler.gun51_62.gun57_Collections_List.Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class StackReverseArrayList {

    public static void main(String[] args) {
        List<String> colorsArrayList = new ArrayList<>();

        colorsArrayList.add("Mavi");
        colorsArrayList.add("Sarı");
        colorsArrayList.add("Kırmızı");
        colorsArrayList.add("Yeşil");
        System.out.println("ArrayList : " + colorsArrayList);

        Stack<String > stackColors = new Stack<>();

        for (String color : colorsArrayList){
            stackColors.push(color);
        }
        System.out.println("Stack : " + stackColors);

        List<String > reversedArrayList = new ArrayList<>();

        while (!stackColors.empty()){
            reversedArrayList.add(stackColors.pop());
        }
        System.out.println("Reversed arrayList : " + reversedArrayList);

        Collections.reverse(colorsArrayList);
        System.out.println("Collections.reverse() : " + colorsArrayList);


    }
}
