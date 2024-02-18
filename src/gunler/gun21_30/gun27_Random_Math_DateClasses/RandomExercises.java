package gunler.gun21_30.gun27_Random_Math_DateClasses;

import java.util.Random;

public class RandomExercises {
    public static void main(String[] args) {


        Random random = new Random();
         int value;
         while (true){
             value = random.nextInt(100-50)+50;
             System.out.println("valueAll = " + value);
             if(value%2!=0){
                 break;
             }
         }
        System.out.println("ExpectedValue = " + value);
    }
}
