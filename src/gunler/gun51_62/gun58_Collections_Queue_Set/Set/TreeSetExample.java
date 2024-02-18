package gunler.gun51_62.gun58_Collections_Queue_Set.Set;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        //TreeSet sorts object in ascending order
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Mavi");
        treeSet.add("Yesil");
        treeSet.add("Gri");
        treeSet.add("Sari");
        treeSet.add("Mavi");
        treeSet.add("Beyaz");
        treeSet.add("10");
        treeSet.add("5");
        treeSet.add("&");
        treeSet.add("A");

        System.out.println("treeSet = " + treeSet);

        for (String each : treeSet){
            System.out.println(each.hashCode());
        }

        TreeSet<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(24);
        treeSet1.add(4);
        treeSet1.add(44);
        treeSet1.add(4);

        System.out.println(treeSet1);
    }
}
