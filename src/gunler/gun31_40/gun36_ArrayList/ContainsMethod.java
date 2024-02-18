package gunler.gun31_40.gun36_ArrayList;
import java.util.ArrayList;

public class ContainsMethod {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Jan");
        list1.add("Feb");
        list1.add("Mar");
        list1.add("Apr");
        list1.add("May");

        System.out.println(list1.toString());

        ArrayList<String> list2 = list1;

        System.out.println(list2.toString());

        ArrayList<String> months = new ArrayList<>(list1);

        System.out.println(months.toString());

        System.out.println(months.contains("Feb"));
        System.out.println(months.contains("Dec"));

        // How to check if Feb is in second index
        System.out.println(months.indexOf("Feb") == 1);
        System.out.println(months.get(1).equals("Feb"));

        System.out.println(list1.toString());
        System.out.println(months.toString());

        System.out.println(months.containsAll(list1));

        if(months.containsAll(list1)){
            System.out.println("Months has all list");
        }else{
            System.out.println("Months has not all list");
        }
    }
}