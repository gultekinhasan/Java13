package exercises.gun36;

import java.util.ArrayList;

public class tekrar {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        ArrayList<String> str2 = new ArrayList<>();
        ArrayList<Integer> str1 = new ArrayList<>();

      /*  str.add("Hasan");
        str.add("Sema");
        str1.add(99);
        str1.add(23);
        str1.add(new Integer(123));
        str1.add(new Integer("12345"));

        System.out.println(str.get(0));
        System.out.println(str.get(1));
        System.out.println(str1.get(0));
        System.out.println(str1.get(1));
        System.out.println(str1.get(2));
        System.out.println(str1.get(3));

        System.out.println(str.size());
        System.out.println(str1.size());

        System.out.println(str.toString());
        System.out.println(str1.toString()); */

        str.add("CMK");
        str.add("BORÇLAR");
        str2.add("ANAYASA");
        str2.add("İCRA");

        System.out.println(str.toString());
        System.out.println(str2.toString());

        str.addAll(str2);
        System.out.println(str.toString());
        System.out.println(str2.toString());

        str2.addAll(str);
        System.out.println(str2.toString());

        str2.addAll(0,str);
        System.out.println(str2.toString());




    }
}
