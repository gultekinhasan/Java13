package gunler.gun51_62.gun57_Collections_List.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
public class PerformanceAddingRemovingArrayListLinkedList {

    public static void main(String[] args) {
        //Test ArrayList adding and removing element performance
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> vector = new Vector<>();

        long start = 0;
        long end = 0;
        int size = 0;

        size = 10_000_000; //Number of items.
        //Adding items to ArrayList
        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("ArrayList add operation(Sequential) : " + (end - start) + " ms");

        //Adding and removing items from ArrayList
        start = System.currentTimeMillis();
        arrayList.add(500000, 12345);
        arrayList.add(500000, 12345);
        arrayList.add(500000, 12345);
        arrayList.add(500000, 12345);
        arrayList.add(500000, 12345);
        arrayList.add(500000, 12345);
        arrayList.add(500000, 12345);
        arrayList.add(500000, 12345);
        arrayList.remove(50);
        arrayList.remove(50);
        arrayList.remove(50);
        arrayList.remove(50);

        end = System.currentTimeMillis();

        System.out.println("ArrayList adding and removing in list : " + (end - start) + " ms");
        System.out.println();

        // arrayList = null; //Assigning null reference to object, when necessary garbage collection may dispose the arrayList object from memory
        arrayList.clear(); //Clearing of all items from ArrayList.

        //Adding items to LinkedList
        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            linkedList.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList add operation(Sequential) : " + (end - start) + " ms");

        //Adding and removing items from ArrayList
        start = System.currentTimeMillis();
        linkedList.add(500000, 12345);
        linkedList.add(500000, 12345);
        linkedList.add(500000, 12345);
        linkedList.add(500000, 12345);
        linkedList.add(500000, 12345);
        linkedList.add(500000, 12345);
        linkedList.add(500000, 12345);
        linkedList.add(500000, 12345);
        linkedList.remove(50);
        linkedList.remove(50);
        linkedList.remove(50);
        linkedList.remove(50);

        end = System.currentTimeMillis();
        System.out.println("LinkedList adding and removing in list : " + (end - start) + " ms");
    }

}
