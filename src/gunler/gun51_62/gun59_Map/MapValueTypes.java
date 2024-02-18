package gunler.gun51_62.gun59_Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapValueTypes {
    public static void main(String[] args) {
        // <Key, Value>
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1,"John");
        map1.put(2,"Jane");
        map1.put(3,"Jim");
        System.out.println("map1 = " + map1);


        //<Key, Array Object>
        Map<String,String[]> map2 = new HashMap<>();
        String[] arr1 = {"john","jane"};
        String[] arr2 = {"Bob","jim"};
        map2.put("family1",arr1);
        map2.put("family2",arr2);
        System.out.println("map2 = " + map2);


        //<Key, Collection Object>
        Map<Integer, List<String>> map3 = new HashMap<>();
        List<String>list1 = Arrays.asList("John","JAne");
        List<String>list2 = Arrays.asList("Bob","Jim");
        map3.put(1,list1);
        map3.put(2,list2);
        System.out.println("map3 = " + map3);


        // <Key, Map Object>
        Map<String,Map<Integer,String>> map4 = new HashMap<>();
        Map<Integer,String> friends1 = new HashMap<>();
        friends1.put(1,"John");
        friends1.put(2,"Jane");
        Map<Integer,String> friends2 = new HashMap<>();
        friends2.put(1,"Bob");
        friends2.put(2,"Jim");
        map4.put("A",friends1);
        map4.put("B",friends2);
        System.out.println("map4 = " + map4);

        // <Key, Template Class Object>
        Map<String,Animal> map5 = new HashMap<>();
        Animal dog = new Animal("dog",5);
        Animal cat = new Animal("cat", 3);
        map5.put("dog",dog);
        map5.put("cat",cat);
        System.out.println("map5 = " + map5);

       // <Collection, Value>
        Map<List<String>,String> map6 = new HashMap<>();
        List<String> list3 = Arrays.asList("John","Jane");
        List<String> list4 = Arrays.asList("Bob","Jim");
        map6.put(list3,"list3");
        map6.put(list4,"list4");
        System.out.println("map6 = " + map6);
        System.out.println(map6.get(list3));

    }
     static class Animal{
            String name;
            int age;

            public Animal(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public String toString() {
                return "Animal{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
    }
}
