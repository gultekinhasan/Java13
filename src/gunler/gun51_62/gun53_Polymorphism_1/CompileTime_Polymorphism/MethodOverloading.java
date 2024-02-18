package gunler.gun51_62.gun53_Polymorphism_1.CompileTime_Polymorphism;

public class MethodOverloading {
    // Compile Time Polymorphism / Static Polymorphism / Method Overloading
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static int add(int a, int b) {
        return a * b;
    }

    public static double add(double a, int b) {
        return a * b;
    }

    public static double add(int a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println("multiply(2,5) = " + multiply(2, 5));
        System.out.println("multiply(3,7,9) = " + multiply(3, 7, 9));
        System.out.println("add(2,5) = " + add(2, 5));
        System.out.println("add(3.5,6) = " + add(3.5, 6));
        System.out.println("add(8,6.8) = " + add(8, 6.8));
    }
}
