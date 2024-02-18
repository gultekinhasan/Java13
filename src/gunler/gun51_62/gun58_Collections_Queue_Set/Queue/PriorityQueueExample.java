package gunler.gun51_62.gun58_Collections_Queue_Set.Queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        //Natural Order
        PriorityQueue priority = new PriorityQueue();
        priority.add(20);
        priority.add(15);
        priority.add(5);
        priority.add(50);
        priority.add(25);
        priority.add(35);
        priority.add(40);

        System.out.println("priority = " + priority);

        //Natural Order is from smaller to bigger for Integers
        System.out.println(priority.peek());
        System.out.println(priority.poll());
        System.out.println(priority.peek());
        System.out.println(priority.poll());
        System.out.println(priority.peek());
        System.out.println(priority.poll());


        // Natural order is alphabetic order in Strings
        PriorityQueue priority2 = new PriorityQueue();
        priority2.add("Zab");
        priority2.add("Aab");
        priority2.add("Baa");
        priority2.add("aaa");
        priority2.add("Aaa");
        priority2.add("Aba");
        priority2.add("Aab");

        System.out.println(priority2.peek());
        System.out.println(priority2.poll());
        System.out.println(priority2.peek());
        System.out.println(priority2.poll());
        System.out.println(priority2.peek());
        System.out.println(priority2.poll());
        System.out.println(priority2.peek());
        System.out.println(priority2.poll());


        //get() method cannot be used in Priority class
        //Because it processes objects according to their priority
        //priority.get()
    }
}
