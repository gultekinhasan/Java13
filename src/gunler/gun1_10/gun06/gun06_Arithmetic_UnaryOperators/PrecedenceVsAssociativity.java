package gunler.gun1_10.gun06.gun06_Arithmetic_UnaryOperators;

public class PrecedenceVsAssociativity {
    public static void main(String[] args) {
        // java arithmetic işlemler için işlem önceliği kurallarına göre hareket eder.

        System.out.println(18+9/3);
        System.out.println("");

        int calculation= 18+9/3;
        System.out.println(calculation);
        System.out.println("");
        System.out.println(3+5*7); //precedence
        System.out.println(42-15/3);
        System.out.println(8+2*3-21/7+3); // precedence + associativity
        System.out.println(4+42/2*3);
        System.out.println(6-3*3+6-8);

        // Java parantez içi işlemi için de işlem önceliği kuralını uygular.

        System.out.println(3+4*4+5*(4+3)-1);
        System.out.println(3+4*4+5*(4+(3+2))-1);

    }
}
