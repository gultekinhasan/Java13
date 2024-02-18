package gunler.gun21_30.gun27_Random_Math_DateClasses;

public class MathClass {
    public static void main(String[] args) {
        //Math Class'tan object oluşturulamaz..
        //Math math = new Math();

        //Method ve instance lara object olusturmadan, doğrudan class name ile ulaşmak mümkün.

        double pi = Math.PI;
        System.out.println("pi = " + pi);

        double pow = Math.pow(3.0,3.0);
        System.out.println("pow = " + pow);

        int pow2 = (int) Math.pow(3,2);
        System.out.println("pow2 = " + pow2);

        double sqrt = Math.sqrt(25);
        System.out.println("sqrt = " + sqrt);

        System.out.println(Math.round(4.5));
        System.out.println(Math.round(4.5f));
        System.out.println(Math.round(4.4));

        System.out.println(Math.floor(4.9));
        System.out.println(Math.ceil(4.1));

        System.out.println(Math.addExact(10,20));
        System.out.println(Math.multiplyExact(3,5));

        System.out.println(Math.min(50,60));
        System.out.println(Math.max(50,60));

        System.out.println(Math.addExact(40,60));





    }
}
