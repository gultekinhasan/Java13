package gunler.gun51_62.gun58_Collections_Queue_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LoopWithIterator {
    public static void main(String[] args) {


        Set<Integer> nums = new HashSet<>();

        nums.add(10);
        nums.add(30);
        nums.add(40);
        nums.add(70);
        nums.add(180);
        nums.add(1500);
        nums.add(1150);
        nums.add(1370);
        nums.add(20);
        nums.add(70);
        nums.add(10);

        System.out.println("nums = " + nums);

        for (Integer num: nums){
            System.out.print(num + " | ");
        }

        System.out.println("\n//////////////////////////");

        Iterator<Integer> it1 = nums.iterator();
        System.out.println(it1.hasNext());
        System.out.println(it1.next());
        System.out.println(it1.next());
        System.out.println(it1.next());
        System.out.println(it1.next());

        Iterator<Integer> it = nums.iterator();

        while (it.hasNext()){
            int val = it.next();
            if (val>1000){
                it.remove();
            }
        }
        System.out.println(nums);

        System.out.println("\n//////////////////////////");


        //for each loop remove()methodu ile kullanim icin exception veriyor oldugundan
        //Iterator objecti kullanmak durumundayiz

//        for (Integer num: nums){
//            if (num>1000){
//                num.remove(num);
//            }
//        }
//        System.out.println(nums);





    }
}
