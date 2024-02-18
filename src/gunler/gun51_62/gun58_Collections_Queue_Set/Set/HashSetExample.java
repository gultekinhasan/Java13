package gunler.gun51_62.gun58_Collections_Queue_Set.Set;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Mavi");
        hashSet.add("Yesil");
        hashSet.add("Gri");
        hashSet.add("Sari");

        //Duplication is not allowed
        //Insertion order is not preserved
        System.out.println("hashSet = " + hashSet);

        for (String each : hashSet){
            System.out.println(each.hashCode());
        }
    }
}
