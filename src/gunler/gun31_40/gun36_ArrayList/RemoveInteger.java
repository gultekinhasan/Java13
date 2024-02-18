package gunler.gun31_40.gun36_ArrayList;

import java.util.ArrayList;

public class RemoveInteger {
    public static void main(String[] args) {
        ArrayList<Integer>  nums = new ArrayList<>();

        System.out.println(nums.size());
        System.out.println(nums.isEmpty());
        System.out.println(nums.size()==0);

        nums.add(1);
        nums.add(23);
        nums.add(12);
        nums.add(45);
        nums.add(46);
        nums.add(27);
        nums.add(245);

        System.out.println(nums.size());
        System.out.println(nums.toString());


        System.out.println(nums.get(5)); // 27
        System.out.println(nums.get(6)); // 245

        // remove()

        nums.remove(5); // index no'ya göre remove
        System.out.println(nums.toString());

        System.out.println(nums.get(5)); // 245

        Integer obj1 = new Integer(12);
        nums.remove(obj1);
        System.out.println(nums.toString());

        nums.remove(new Integer(23));  // obj değerine göre remove
        System.out.println(nums.toString());

        System.out.println("---------------------------------------------");

        // add(index,element)
        nums.add(3,35);
        System.out.println(nums.get(3));
        System.out.println(nums.get(4));
        System.out.println(nums.toString());

        System.out.println("---------------------------------------------");

        // set(index,element)

        nums.set(3,36);
        System.out.println(nums.get(30));
        System.out.println(nums.get(4));

        System.out.println(nums.toString());


    }
}
