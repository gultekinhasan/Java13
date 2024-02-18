package gunler.gun1_10.gun08.gun08_Assignment_Relational_LogicalOperators;

public class PrecedenceOfAllOperators {


        public static void main(String[] args) {

            int num1 = 10;
            int num2 = 30;
            int num3 = 40;

            boolean result = num1 < num2 || num3 > num1; // Relational ==> Logical ==> Assignment

            System.out.println("result = " + result);

            System.out.println("--------------");


            String havaDurumu;
            int derece;
            havaDurumu = "Gunesli";
            derece = 21;

            boolean disariCikilirmi = havaDurumu == "Yagmurlu" && derece > 20; // Relational ==> Logical ==> Assignment

            System.out.println("disariCikilirmi = " + disariCikilirmi);

            System.out.println("---------------");


            int num = 3;
            boolean sum = --num == 3 || num == 2 && num-- == 2; // Unary ==> Relational ==> Logical ==> Assignment
            // F  ||  T  &&  T
            // F  ||  T
            //    T

            System.out.println("sum = " + sum);


        }
    }

