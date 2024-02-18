package gunler.gun51_62.gun58_Collections_Queue_Set.Queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue<String> que = new LinkedList<>();
        que.add("Cemil");
        que.add("Ahmet");
        que.add("Mehmet");
        que.add("Beyza");

        //FIFO - First in
        System.out.println("que = " + que);

        //FIFO - First out - removes first element from the list
        String name = que.remove();
        System.out.println("name = " + name);
        System.out.println("que = " + que);

        //FIFO - First out - removes first element from the list
        name = que.poll();
        System.out.println("name = " + name);
        System.out.println("que = " + que);

        //Gets the first element in the order
        name = que.peek();
        System.out.println("name = " + name);
        System.out.println("que = " + que);

        //Difference between poll() and remove()
        que.poll();
        que.poll();
        que.poll(); // Empty list but no exception

        try{
            que.remove(); // empty list with exception
        }catch (NoSuchElementException e){
            System.out.println("Hop!! your list is empty..");
        }
    }
}
