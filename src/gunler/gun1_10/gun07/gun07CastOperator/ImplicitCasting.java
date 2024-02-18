package gunler.gun1_10.gun07.gun07CastOperator;

public class ImplicitCasting {
    public static void main(String[] args) {

        int myInt = 9;
        double myDouble = myInt; // Implicit Casting - Auto Conversion
        System.out.println("myInt = "  + myInt); //9
        System.out.println("myDouble = " + myDouble); //9.0

        int i = 100;
        long l = i;
        float f = l;
        double d = f;
        double d2 = l;

        
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("d2 = " + d2);

        System.out.println("");
        System.out.println("");
        System.out.println("");



    }
}
