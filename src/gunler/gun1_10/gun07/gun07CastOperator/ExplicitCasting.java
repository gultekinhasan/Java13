package gunler.gun1_10.gun07.gun07CastOperator;

public class ExplicitCasting {
    public static void main(String[] args) {
        double myDouble = 9.78;
        int myInt = (int) myDouble; // explicit casting - manual conversion
        double myDouble2 = myInt;
        

        System.out.println("myDouble = " + myDouble); //9.78
        System.out.println("myInt = " + myInt); //9
        System.out.println("myDouble2 = " + myDouble2);//9.0


        System.out.println("");

        double d = 100.4;
        long l = (long) d; //explicit casting with data loss
        int i = (int) l; //explicit casting without data loss

        System.out.println("d = " + d);
        System.out.println("l = " + l);
        System.out.println("i = " + i);
    }
}
