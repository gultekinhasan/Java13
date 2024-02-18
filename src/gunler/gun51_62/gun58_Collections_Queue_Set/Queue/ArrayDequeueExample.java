package gunler.gun51_62.gun58_Collections_Queue_Set.Queue;

import java.util.ArrayDeque;

public class ArrayDequeueExample {
    public static void main(String[] args) {

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(20);
        arrayDeque.add(10);
        arrayDeque.add(15);
        arrayDeque.add(5);

        System.out.println("arrayDeque = " + arrayDeque);


        //pick first element from the list
        System.out.println("arrayDeque.peekFirst() = " + arrayDeque.peekFirst());
        System.out.println("arrayDeque = " + arrayDeque);

        //pick last element from the list
        System.out.println("arrayDeque.peekLast() = " + arrayDeque.peekLast());
        System.out.println("arrayDeque = " + arrayDeque);

        //first out
        System.out.println("arrayDeque.poll() = " + arrayDeque.poll());
        System.out.println("arrayDeque = " + arrayDeque);

        //add element in first order
        arrayDeque.addFirst(30);
        System.out.println("arrayDeque = " + arrayDeque);

        //add element in last order
        arrayDeque.addLast(40);
        System.out.println("arrayDeque = " + arrayDeque);

        //clears the list to empty
        arrayDeque.clear();
        System.out.println("arrayDeque = " + arrayDeque);


    }
}
