package gunler.gun1_10.gun07.gun07CastOperator;


    public class CastingChar{
        public static void main(String[] args) {

            int num = 65;
            char ch = (char) num; // Explicit Casting
            System.out.println("ch = " + ch); // A

            int num2 = 37169;
            char ch2 = (char) num2; // Explicit Casting
            System.out.println("ch2 = " + ch2); // 鄱

            char ch3 = 'A';
            int num3 = ch3; // Implicit Casting
            System.out.println("num3 = " + num3); // 65

            byte num4 = 75;
            char ch4 = (char) num4; // Explicit Casting -- byte-char data turu (numeric to alphabetic) oldugu icin her ne kadar memory alani kucuk olsada explicit casting istiyor
            System.out.println("ch4 = " + ch4);

            char ch5 = 'Z';
            byte num5 = (byte) ch5; // Explicit Casting
            System.out.println("num5 = " + num5);

            // boolean can not be converted any data type
            boolean b = true;
            // int i = b; // boolean can not be casted to any type
            // int i = (int) b;
            // char ch6 = b;

        }
    }


