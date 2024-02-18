package gunler.gun51_62.gun57_Collections_List.List;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class PerformanceAddSequential {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###");
        int numberOfElements = 20_000_000;
        long startTime;
        long endTime;
        long duration;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("Adding data sequentially...");
        System.out.println("---------------------------------------");

        System.out.println("ArrayList sequential adding performance");
        startTime = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            arrayList.add(i);
        }
        System.out.println("Elements added successfully");
        endTime = System.nanoTime();
        duration = endTime-startTime;
        System.out.println("Duration of " + df.format(numberOfElements) +  " elements sequential adding to ArrayList : " + df.format(duration) + " nano seconds");
        System.out.println();
        ///////////////////////////////////////////

        System.out.println("LinkedList sequential adding performance");
        startTime = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            linkedList.add(i);
        }
        System.out.println("Elements added successfully");
        endTime = System.nanoTime();
        duration = endTime-startTime;
        System.out.println("Duration of " + df.format(numberOfElements) +  " elements sequential adding to LinkedList : " + df.format(duration)+ " nano seconds");
        System.out.println();

        System.out.println("Arraylist Adding(inserting) data with index");
        //ArrayList inserting elements
        int index = 5000;
        startTime = System.nanoTime();
        arrayList.add(index,350);
        arrayList.add(index,350);
        arrayList.add(index,350);
        arrayList.add(index,350);
        arrayList.add(index,350);

        endTime = System.nanoTime();
        duration = endTime-startTime;
        System.out.println("Duration of inserting elements to ArrayList : " + df.format(duration)+ " nano seconds");
        System.out.println();

        System.out.println("LinkedList Adding(inserting) data with index");
        //LinkedList inserting elements
        index = 5000;
        startTime = System.nanoTime();
        linkedList.add(index,350);
        linkedList.add(index,350);
        linkedList.add(index,350);
        linkedList.add(index,350);
        linkedList.add(index,350);

        endTime = System.nanoTime();
        duration = endTime-startTime;
        System.out.println("Duration of inserting elements to LinkedList : " + df.format(duration)+ " nano seconds");
        System.out.println();
    }

}
