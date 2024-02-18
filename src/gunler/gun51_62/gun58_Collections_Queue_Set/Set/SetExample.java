package gunler.gun51_62.gun58_Collections_Queue_Set.Set;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        Set<Integer> mySet = new HashSet<>();
        mySet.add(10);
        mySet.add(20);
        mySet.add(30);
        mySet.add(50);
        mySet.add(100);
        mySet.add(100);
        mySet.add(100);

        System.out.println(mySet);

        System.out.println("mySet.size() = " + mySet.size());


        List<String> list = Arrays.asList("15","15","a","c","tt","%","c");
        System.out.println("list = " + list);

        Set<String> mySet2 = new HashSet<>(list);
        System.out.println("mySet2 = " + mySet2);

        ///////////////////////////////////////

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(500);
        treeSet.add(100);
        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(900);
        treeSet.add(100);

        System.out.println("treeSet = " + treeSet);

        System.out.println("treeSet.add(100) = " + treeSet.add(100)); //false
        System.out.println("treeSet.add(60) = " + treeSet.add(60)); //true
        System.out.println("treeSet = " + treeSet);




    }
}
