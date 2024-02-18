package gunler.gun31_40.gun36_ArrayList;

import java.util.ArrayList;

public class Cities {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("London");
        cities.add("Virginia");
        cities.add("Washington");
        cities.add("Baku");
        cities.add("Berlin");
        cities.add("Baku");

        System.out.println(cities.toString());

            for (String city : cities){
                System.out.println(city + ",");
            }

        System.out.println("\n----------------------");

        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i)+",");
        }

        System.out.println("\n----------------------");

        cities.remove("Baku");
        System.out.println(cities.toString());

        cities.remove("Baku");
        System.out.println(cities.toString());

        System.out.println("\n----------------------");

        cities.add(0,"Istanbul");
        cities.add(cities.size(), "Ankara");
        System.out.println(cities.toString());

        System.out.println("\n----------------------");

        int index = cities.indexOf("Berlin");
        cities.set(index,"Munih");
        System.out.println(cities.toString());

        System.out.println("\n----------------------");

        cities.clear();
        System.out.println(cities.size());
        System.out.println(cities.isEmpty());
        System.out.println(cities.toString());



    }
}
