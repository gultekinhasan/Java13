package gunler.gun51_62.gun59_Map;

import java.util.*;

public class LoopingMap {
    public static void main(String[] args) {


        Map<String,String> capitalCities = new LinkedHashMap<>();
        capitalCities.put("England","London");
        capitalCities.put("Germany","Berlin");
        capitalCities.put("France","Paris");
        capitalCities.put("Russia","Moscow");
        capitalCities.put("Turkey","Ankara");


        System.out.println("capitalCities = " + capitalCities);

        //get list of key/Countries
        System.out.println(capitalCities.keySet());

        //get List of values/Cities
        System.out.println(capitalCities.values());

        System.out.println("Printing Keys...");
        for(String country : capitalCities.keySet()){
            System.out.println(country + " | ");
        }

        //2.yontem
        Set<String> countries = capitalCities.keySet();
        for (String country : countries){
            System.out.println(country + " | ");
        }

        System.out.println();

        Collection<String> capitals = capitalCities.values();
        for (String capital : capitals){
            System.out.println( capital + " | ");
        }

        System.out.println();

        //how to print key and value pairs in same for each loop


        for (String country : capitalCities.keySet()){
            System.out.println(country + " | " + capitalCities.get(country));
        }

        System.out.println();

        //2.yontem

        for (Map.Entry<String,String> capital : capitalCities.entrySet()){
            System.out.println(capital.getKey()+ " | " + capital.getValue());
        }
    }
}
