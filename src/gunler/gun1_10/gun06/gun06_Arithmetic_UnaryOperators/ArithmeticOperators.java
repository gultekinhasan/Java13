package gunler.gun1_10.gun06.gun06_Arithmetic_UnaryOperators;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int addition, subtraction, division, multiplication, modulo;
        int num1 = 10;
        int num2 = 3;

        addition= num1 + num2;
        System.out.println("addition = " + addition);

        subtraction=num1-num2;
        System.out.println("subtraction = " + subtraction );

        division= num1/num2;
        System.out.println("division = " + division);

        multiplication= num1*num2;
        System.out.println("multiplication = " + multiplication);

        modulo= num1%num2;
        System.out.println("modulo = " + modulo);

        // java 0 a bölme işleminde beklendiği üzere hata verir.
       // System.out.println(10/0);

        System.out.println(0/10);
        System.out.println(10*0);
        System.out.println(10/3);


        double num3 = 10;
        double num4 = 3;
        System.out.println(num3/num4);

        System.out.println("");

        System.out.println(18+9/3);
        System.out.println("");

        int calculation= 18+9/3;
        System.out.println(calculation);

    }
}
