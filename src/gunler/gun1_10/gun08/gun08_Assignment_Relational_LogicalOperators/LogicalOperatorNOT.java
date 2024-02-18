package gunler.gun1_10.gun08.gun08_Assignment_Relational_LogicalOperators;

public class LogicalOperatorNOT {



    public static void main(String[] args) {

        boolean b = 3 == 5; // 3 sayisi 5 e esitmidir ? cevap: hayir
        boolean b2 = 3 != 5; // 3 sayisi 5 e esit degilmidir ? cevap: evet

        System.out.println("b = " + b);
        System.out.println("b2 = " + b2);

        int i1 = 15;
        int i2 = 10;
        double d1 = 20.5;
        double d2 = 15.7;

        // ! Not operatoru
        boolean res1 = (i1 >= i2) && (d1 != d2); // T & T = T
        System.out.println("res1 = " + res1);

        boolean res2 = (i1 >= i2) && !(d1 <= d2); // T & !F = T
        System.out.println("res2 = " + res2);

        // ! Not Operatoru boolean degeri dogrudan tersine cevirmeye yarar
        boolean success = true;
        System.out.println("success = " + success); // true
        System.out.println("success = " + !success); // false

    }
}