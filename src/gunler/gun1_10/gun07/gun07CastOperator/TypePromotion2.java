package gunler.gun1_10.gun07.gun07CastOperator;

public class TypePromotion2 {


        public static void main(String[] args) {

            // Aritmetic islemde, sonuc; isleme giren her bir deger arasinda data turu en buyuk olana yukseltilir

            byte b = 42;
            char c = 'a';
            short s = 1024;
            int i = 5000;
            float f = 1.26f;
            double d = 205.65;

            double result = (f * b) + (i / c) - (d * s);
            System.out.println("result = " + result);
            int result2 = (int) result;
            System.out.println("result2 = " + result2);

            /////////////////////

            int i2 = 5;
            float f2 = 15.7f;
            long l2 = 14124235252l;
            double d2 = 26.4;

            float result3 = i2 * f2;
            long result4 = l2 * i2;
            double result5 = d2 * f2;

            double result6 = i2 * f2; // implicit casting // double = float;
            int result7 = (int) (i2 * f2); // explicit casting // int = (int) float;

            System.out.println("result3 = " + result3);
            System.out.println("result4 = " + result4);
            System.out.println("result5 = " + result5);
            System.out.println("result6 = " + result6);
            System.out.println("result7 = " + result7);

        }
    }

