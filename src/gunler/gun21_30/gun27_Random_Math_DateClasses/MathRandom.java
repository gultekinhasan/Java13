package gunler.gun21_30.gun27_Random_Math_DateClasses;

public class MathRandom {
    public static void main(String[] args) {

        System.out.println("Math.random() = " + Math.random());
        System.out.println("Math.random() = " + Math.random());
        System.out.println("Math.random() = " + (int) (Math.random() * 10)); // 0 ==> 9
        System.out.println("Math.random() = " + (int) (Math.random() * 1)); // only 0

        // altsinir + (int) Math.random() * range // alsinir ==> range -1

        int random = 10 + (int) (Math.random() * 90); // 10 ==> 100 -1
        System.out.println("random = " + random);


        // Write an expression that obtains a random integer between 34 and 55.
        int sayi1 = 34 + (int) (Math.random() * (55 - 34));
        System.out.println("sayi1 = " + sayi1);

        // Write an expression that obtains a random integer between 0 and 999.
        int sayi2 = (int) (Math.random() * 999);
        System.out.println("sayi2 = " + sayi2);

        // Write an expression that obtains a random number between 5.5 and 55.5
        double sayi3 = (Math.random() * 50.0) + 5.5;
        System.out.println("sayi3 = " + sayi3);

    }
}
