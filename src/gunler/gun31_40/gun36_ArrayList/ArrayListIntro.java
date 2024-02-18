package gunler.gun31_40.gun36_ArrayList;

import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {
        // Creating an ArrayList Object.
        ArrayList <String> names = new ArrayList<>();

        ArrayList<Integer> numbers = new ArrayList<>();


        //Assigning values to an Arraylist

        names.add("Ahmet");
        names.add("Ayse");
        names.add("Hasan");
        names.add("Emine");

        numbers.add(99);
        numbers.add(10);
        numbers.add(56);
        numbers.add(43);
        numbers.add(new Integer(55));
        numbers.add(new Integer("123"));
        // numbers.add("123"); --> error çalışmaz


        //Reading value from an ArrayList.

        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));
        System.out.println(names.get(3));
      //  System.out.println(names.get(4)); / index out off bounds hatası verir..

        System.out.println(numbers.get(0));
        System.out.println(numbers.get(4));
        System.out.println(numbers.get(5));


        System.out.println("names count : " + names.size());
        System.out.println("numbers count : " + numbers.size());

        System.out.println(names.toString());
        System.out.println(numbers.toString());

        String str1 =names.toString();
        String str2 =numbers.toString();

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);


        System.out.println(numbers);
        System.out.println(names);


    }
}
