package gunler.gun51_62.gun57_Collections_List.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerformanceMemoryUsage {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
      /*  System.out.println("runtime.totalMemory() = " + runtime.totalMemory());
        System.out.println("runtime.freeMemory()  = " + runtime.freeMemory());*/

        long arrayListtenOncekiHafiza = runtime.totalMemory() - runtime.freeMemory();

        int numbersOfElements = 1_000_000; //Listeye eklenecek eleman sayısı
        System.out.println( numbersOfElements + " elements will be create... ");
        System.out.println("Creating ArrayList...");

        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < numbersOfElements; i++) {
            arrayList.add(i);
        }
        long arrayListtenSonrakiHafiza = runtime.totalMemory() - runtime.freeMemory();
        long arrayListToplamHafiza = arrayListtenSonrakiHafiza - arrayListtenOncekiHafiza;

        System.out.println("ArrayList toplam hafıza : " + arrayListToplamHafiza + " bytes");
        System.out.println("ArrayList toplam hafıza : " + arrayListToplamHafiza / 1024.0 + " kilo bytes");
        System.out.println("ArrayList toplam hafıza : " + arrayListToplamHafiza / 1024.0 / 1024.0 + " Mega bytes");
        System.out.println("ArrayList toplam hafıza : " + arrayListToplamHafiza / 1024.0 / 1024.0 / 1024.0 + " Giga bytes");
        System.out.println();

        //LinkedList
        long linkedListtenOncekiHafiza = runtime.totalMemory() - runtime.freeMemory();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("Creating LinkedList...");
        for (int i = 0; i < numbersOfElements; i++) {
            linkedList.add(i);
        }

        long linkedListtenSonrakiHafiza = runtime.totalMemory() - runtime.freeMemory();
        long linkedListToplamHafiza = linkedListtenSonrakiHafiza - linkedListtenOncekiHafiza;
        System.out.println("LinkedList toplam hafıza : " + linkedListToplamHafiza + " bytes");
        System.out.println("LinkedList toplam hafıza : " + linkedListToplamHafiza / 1024.0 + " kilo bytes");
        System.out.println("LinkedList toplam hafıza : " + linkedListToplamHafiza / 1024.0 / 1024.0 + " Mega bytes");
        System.out.println("LinkedList toplam hafıza : " + linkedListToplamHafiza / 1024.0 / 1024.0 / 1024.0 + " Giga bytes");
        System.out.println();

     /*   //ArrayList Araya eleman ekleme
        System.out.println("ArrayList araya eleman ekleme...");
        long baslangicArr = System.nanoTime();
        arrayList.add(10000, 12345);
        arrayList.add(10000, 12345);
        arrayList.remove(10000);
        arrayList.add(10000, 12345);
        long bitisArr = System.nanoTime();
        long zamanFarkArr = bitisArr - baslangicArr;
        System.out.println("zamanFarkArr = " + zamanFarkArr);
        System.out.println();

        //LinkedList- Araya eleman ekleme
        System.out.println("LinkedList araya eleman ekleme...");
        long baslangicLink = System.nanoTime();
        linkedList.add(10000, 12345);
        linkedList.add(10000, 12345);
        linkedList.remove(10000);
        linkedList.add(10000, 12345);
        long bitisLink = System.nanoTime();
        long zamanFarkLink = bitisLink - baslangicLink;
        System.out.println("zamanFarkLink = " + zamanFarkLink);

        System.out.println("arrayList.get(10000) = " + arrayList.get(10000));
        System.out.println("linkedList.get(10000) = " + linkedList.get(10000));*/
    }

}
