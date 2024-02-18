package gunler.gun21_30.gun22_MethodOverLoading;

public class AreaCalculator {
    public static void main(String[] args) {

        // Kare, Dikdortgen, Ucgen ve Dairenin alanini hesaplayan bir program yaziniz

        int squareArea = calculateArea(5);
        System.out.println("squareArea = " + squareArea);

        int rectangleArea = calculateArea(3,5);
        System.out.println("rectangleArea = " + rectangleArea);

        int triagleArea = calculateArea(3,4,5);
        System.out.println("triagleArea = " + triagleArea);

        double circleArea = calculateArea(5.0);
        System.out.println("circleArea = " + circleArea);
    }

    public static int calculateArea(int sideLength){
        return sideLength * sideLength;
    }

    public static int calculateArea(int length, int width){
        return length * width;
    }

    public static int calculateArea(int base, int higth, int side3){
        return (base * higth) / 2;
    }

    public static double calculateArea(double radius){
        return 3.14 * radius * radius;
    }
}
