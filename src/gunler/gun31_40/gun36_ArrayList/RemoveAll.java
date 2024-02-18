package gunler.gun31_40.gun36_ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
public class RemoveAll {

    public static void main(String[] args) {

        // Tek satirda liste olusturmak
        ArrayList<String> listone = new ArrayList<>(Arrays.asList("a", "b", "c", "z", "...."));

        System.out.println(listone.toString());

        ArrayList<Integer> list1 = new ArrayList(Arrays.asList(30, 12, 22));

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(233, 30, 52454, 12, 30, 35636, 22)); // [233, 30, 52454, 12, 30, 35636, 22]

        System.out.println(list1.toString()); // [30, 12, 22]
        System.out.println(list2.toString()); // [233, 30, 52454, 12, 30, 35636, 22]

        list2.removeAll(list1);

        System.out.println(list2.toString()); // [233, 52454, 35636]

    }
}