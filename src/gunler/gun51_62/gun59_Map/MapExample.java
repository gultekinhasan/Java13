package gunler.gun51_62.gun59_Map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        //    Key   Value   Data   Type
        Map<String,Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);

        System.out.println(map);


        //Retrieves values according to keys
        System.out.println("Value of A : " + map.get("A"));
        System.out.println("Value of B : " + map.get("B"));
        System.out.println("Value of C : " + map.get("C"));


    }
}
