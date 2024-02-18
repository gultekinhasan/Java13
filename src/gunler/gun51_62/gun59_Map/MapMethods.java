package gunler.gun51_62.gun59_Map;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {

        Map<String,Double> items = new HashMap<String,Double>();
        items.put("Apple",5.4);
        items.put("Orange",6.2);
        items.put("Banana",8.5);
        items.put("Cherry",9.0);

        System.out.println("items = " + items);

        //key must be unique
        //duplicate key means an update for existing key
        items.put("Apple",5.8);
        System.out.println("items = " + items);


        System.out.println(items.remove("apple"));
        System.out.println("items = " + items);

        System.out.println(items.remove("watermelon"));
        System.out.println("items = " + items);


        System.out.println(items.putIfAbsent("Banana",9.7));
        System.out.println("items = " + items);

        System.out.println(items.putIfAbsent("Berry",4.7));
        System.out.println("items = " + items);


        System.out.println("Apple is in the List ? : " + items.containsKey("Apple"));  //false
        System.out.println("Orange is in the List ?: " + items.containsKey("Orange")); //true


        System.out.println("Any item with the following value in the list? : " + items.containsValue(2.5)); // false
        System.out.println("Any item with the following value in the list? : " + items.containsValue(9.0)); // true



    }
}
