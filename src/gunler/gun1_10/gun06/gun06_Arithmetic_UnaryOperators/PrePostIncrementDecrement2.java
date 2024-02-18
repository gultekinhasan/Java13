package gunler.gun1_10.gun06.gun06_Arithmetic_UnaryOperators;
public class PrePostIncrementDecrement2 {

    public static void main(String[] args) {

        int x = 50;
        int y = --x + x++ + x-- + x++;
        // x ==> 49 + 50  + 49  + 50
        // y ==> 49 + 49  + 50  + 49

        System.out.println("x = " + x); // 50
        System.out.println("y = " + y); // 197

    }
}