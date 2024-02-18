package gunler.gun21_30.gun30_Review;

public class GeometryCalculation {

    public static void main(String[] args) {

        double circleArea = calculateCircleArea(5.5);
        System.out.println("circleArea = " + circleArea);

        double circleCircumference = calculateCircleCircumference(5.5);
        System.out.println("circleCircumference = " + circleCircumference);

        int rectangleArea = calculateRectangleArea(5,9);
        System.out.println("rectangleArea = " + rectangleArea);

        int rectanglePerimeter = calculateRectanglePerimeter(5,9);
        System.out.println("rectanglePerimeter = " + rectanglePerimeter);

        double hypotenuse = calculateHypotenuse(3,4);
        System.out.println("hypotenuse = " + hypotenuse);

        double cylinderVolume = calculateCylinderVolume(5.5, 7);
        System.out.println("cylinderVolume = " + cylinderVolume);



    }

    public static double calculateCircleArea(double radius){
        double area = Math.PI * Math.pow(radius,2);
        return Math.round(area);
    }

    public static double calculateCircleCircumference(double radius){
        double area = 2 * (Math.PI * radius);
        return Math.round(area);
    }

    public static int calculateRectangleArea(int width, int length){
        return Math.multiplyExact(width,length);
    }

    public static int calculateRectanglePerimeter(int width, int length){
        return 2 * (Math.addExact(width,length));
    }

    public static double calculateHypotenuse(double side1, double side2){
        return Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2));
    }

    public static double calculateCylinderVolume(double radius, double height){
        double volume = Math.PI * Math.pow(radius,2) * height;
        return Math.round(volume);
    }
}