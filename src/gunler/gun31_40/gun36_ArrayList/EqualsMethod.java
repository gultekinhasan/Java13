package gunler.gun31_40.gun36_ArrayList;

import java.util.ArrayList;

public class EqualsMethod {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Jan");
        list1.add("Feb");
        list1.add("Mar");
        list1.add("Apr");
        list1.add("May");


        System.out.println(list1.toString());

        ArrayList<String> months = new ArrayList<>(list1);

        System.out.println(months.toString());

        if (months.equals(list1)){
            System.out.println("Both lists are the same.");
        }else System.out.println("Lists are different.");


        months.add("June");

        if (months.equals(list1)){
            System.out.println("Both lists are the same.");
        }else System.out.println("Lists are different.");
    }
}