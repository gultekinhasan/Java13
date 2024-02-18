package gunler.gun1_10.gun08.gun08_Assignment_Relational_LogicalOperators;

public class LogicalOperatorOR {


        public static void main(String[] args) {

            //           True     False
            boolean b = (3<=7) | (5>=9);
            System.out.println("b = " + b); // true

            // | Truth Table
            System.out.println(true | true); // true
            System.out.println(true | false); // true
            System.out.println(false | true); // true
            System.out.println(false | false); // false

            int i1 = 15;
            int i2 = 10;
            double d1 = 20.5;
            double d2 = 15.7;

            System.out.println(i1 >= i2);
            System.out.println(d1 <= d2);

            // Tekli | operator
            boolean res1 = (i1 >= i2) | (d1 >= d2); // T | T = T
            System.out.println("res1 = " + res1);

            boolean res2 = (i1 >= i2) | (d1 <= d2); // T | F = T
            System.out.println("res2 = " + res2);

            // Ciftli && operator
            boolean res3 = (i1 >= i2) || (d1 >= d2); // T || T = T
            System.out.println("res3 = " + res3);

            boolean res4 = (i1 >= i2) || (d1 <= d2); // T || F = T
            System.out.println("res4 = " + res4);

            // || Truth Table
            System.out.println(true || true); // true
            System.out.println(true || false); // true
            System.out.println(false || true); // true
            System.out.println(false || false); // false

            // Tek | Operatoru ile Cift || Operatoru arasindaki fark
            // Eger expressionlardan biri true donuyor ise cift || operatorunde
            // diger expressionlari kontrol etmeden true durumunu basiyor
            // Ancak tek | operantta birinci expression true olsa dahi gerekmedigi halde
            // tum expressionlari kontrol ediyor ve sonra true basiyor
            // Fark tamamen performas ile ilgili, logic ile ilgili degil


        }
    }
