package gunler.gun1_10.gun08.gun08_Assignment_Relational_LogicalOperators;


public class PredenceOfLogicalOperators {

        public static void main(String[] args) {

        /*
        Precedence of logical operators

        Highest
            !
            &&
            ||
        Lowest
         */

            int i1 = 10;
            int i2 = 15;
            int i3 = 20;

            boolean check = i1 != i2 || !(i1 == i3) && i2 == i3;   //  T  ||  !F  && F
            //   T  ||  T   && F
            //   T  ||  F
            //    T

            System.out.println("check = " + check);

            boolean check2 = (i1 >= i2) && (i3 == i2) || (i1 != i3);    //  F  &&  F  || T
            //  F  ||  T
            //  T

            System.out.println("check2 = " + check2);
        }
    }

