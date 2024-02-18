package gunler.gun1_10.gun06.gun06_Arithmetic_UnaryOperators;

public class UnaryOperators {

    public static void main(String[] args) {

        // '+' '-' Unary operators
        int num1 = +10;
        System.out.println("num1 = " + num1);

        int num2 = -100;
        System.out.println("num2 = " + num2);

        int sum = num1 + num2;
        System.out.println("-sum = " + -sum);

        System.out.println(-(num1 + num2));


        // ! operator
        boolean b = true;
        System.out.println("b = " + b); // true
        System.out.println("b = " + !b); // false
        System.out.println("b = " + !!b); // true


        // '++' increment - '--' decrement operators
        int i = 10;
        int j = 5;

        i++; // i = i+1 post-increment
        j--; // j = j-1 post-decrement
        System.out.println("i = " + i); // 11
        System.out.println("j = " + j); // 4

        ++i; // i = i+1 pre-increment
        --j; // j = j-1 pre-decrement
        System.out.println("i = " + i); // 12
        System.out.println("j = " + j); // 3

        int x = 20;
        int y = 30;

        // Degeri bir arttirir veya azaltir ayni islemde uygular
        System.out.println("x = " + ++x); // 21
        System.out.println("y = " + --y); // 29

        // Degeri bir arttirir veya azaltir ancak ayni islemde degil devam eden islemde uygular
        System.out.println("x = " + x++); // 21
        System.out.println("y = " + y--); // 29

        // Bir onceki arttirma ve eksiltme islemini bu satirda uygulamis oldu
        System.out.println("x = " + x); // 22
        System.out.println("y = " + y); // 28

    }
}



