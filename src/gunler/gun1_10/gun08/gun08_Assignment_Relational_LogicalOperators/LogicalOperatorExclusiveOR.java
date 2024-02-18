package gunler.gun1_10.gun08.gun08_Assignment_Relational_LogicalOperators;

public class LogicalOperatorExclusiveOR {


        public static void main(String[] args) {

            //           True     False
            boolean b = (3<=7) ^ (5>=9);
            System.out.println("b = " + b); // true

            // ^ Truth Table
            System.out.println(true ^ true); // false
            System.out.println(true ^ false); // true
            System.out.println(false ^ true); // true
            System.out.println(false ^ false); // false

            int i1 = 15;
            int i2 = 10;
            double d1 = 20.5;
            double d2 = 15.7;

            // Tekli ^ bitwise exclusive OR operator
            boolean res1 = (i1 >= i2) ^ (d1 >= d2); // T | T = F
            System.out.println("res1 = " + res1);

            boolean res2 = (i1 >= i2) ^ (d1 <= d2); // T | F = T
            System.out.println("res2 = " + res2);

            // Ciftli ^^ operator mevcut degil
            // boolean res3 = (i1 >= i2) ^^ (d1 >= d2); // T || T = T

        }
    }
