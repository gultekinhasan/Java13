package exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class question {

    public static void main(String[] args) {
        List<Integer> original = Arrays.asList(3, 6, 7, 8, 9, 12, 15, 17, 359);
        for (int i = 0; i < original.size(); i++) {
           if (i != original.size()-1){
               System.out.print(original.get(i)*original.get(i) + ",");
           }else System.out.print(original.get(i)*original.get(i));
        }
        System.out.println("--------------------");



        for (int i = 0; i < original.size()-1; i++) {
            if (i != original.size()-1 && (original.get(i)%3==0)){
                System.out.print(original.get(i) + ",");

            }
        }
        System.out.println("*************************************");




            boolean flag = false;

            for(int i=0; i<original.size(); i++){

                if(original.get(i) % 3 != 0){
                    continue;
                }

                if(flag){
                    System.out.print(",");
                }

                if(original.get(i) % 3 == 0){
                    System.out.print(original.get(i));
                    flag = true;
                }
            }

    }
}