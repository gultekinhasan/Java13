package gunler.gun51_62.gun57_Collections_List.Vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListVectorMultiThread {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> vector = new Vector<>();

        arrayList.add(123);
        arrayList.add(45);
        arrayList.add(12366);
        System.out.println(arrayList);

        vector.add(84628);
        vector.add(5355);
        vector.add(444);
        System.out.println(vector);
        System.out.println();

        ///////////////////////////////////////////////////////

        //Multi-thread element adding to ArrayList and Vector
        List<Integer> multiThreadArrayList = new ArrayList<>();
        List<Integer> multiThreadVector = new Vector<>(); //Vector is a thread-safe list
        //Two threade created t1 and t2
        //Each thread adds element to same arraylist- multiThreadArrayList
        Thread t1 = new Thread(() -> {
            int counter = 0;
            System.out.println("Thread -1");
            for (int i = 0; i < 1_000_000; i++) {
                multiThreadArrayList.add(i);
                counter++;
            }
            System.out.println("Thread-1 number of adding : " + counter);
        });

        Thread t2 = new Thread(() -> {
            int counter = 0;
            System.out.println("Thread -2");
            for (int i = 0; i < 1_000_000; i++) {
                multiThreadArrayList.add(i);
                counter++;
            }
            System.out.println("Thread-2 number of adding : " + counter);
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(multiThreadVector.size());
        System.out.println();

        //Two thread created t1 and t2
        //Each thread adds element to same vector- multiThreadVector
        System.out.println("Vector multi-thread");
        t1 = new Thread(() -> {
            int counter = 0;
            System.out.println("Vector Thread -1");
            for (int i = 0; i < 1_000_000; i++) {
                multiThreadVector.add(i);
                counter++;
            }
            System.out.println("Vector Thread -1 number of adding : " + counter);
        });
        t2 = new Thread(() -> {
            int counter = 0;
            System.out.println("Vector Thread -2");
            for (int i = 0; i < 1_000_000; i++) {
                multiThreadVector.add(i);
                counter++;
            }
            System.out.println("Vector Thread -2 number of adding : " + counter);
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(multiThreadVector.size());
    }
}
