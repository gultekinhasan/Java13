package gunler.gun51_62.gun59_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapClasses {
    public static void main(String[] args) {


        // HashMap
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("John",35);
        hashMap.put("Jane",32);
        hashMap.put("Bob",40);

        for(Map.Entry<String,Integer> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }

        System.out.println();

        // LinkedHashMap
        Map<String,Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("John",35);
        linkedHashMap.put("Jane",32);
        linkedHashMap.put("Bob",40);

        for(Map.Entry<String,Integer> entry : linkedHashMap.entrySet()){
            System.out.println(entry.getKey() + " | "+ entry.getValue());
        }

        System.out.println();

        // TreeMap
        Map<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("John",35);
        treeMap.put("Jane",32);
        treeMap.put("Bob",40);

        for(Map.Entry<String,Integer> entry : treeMap.entrySet()){
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }














    }

}
