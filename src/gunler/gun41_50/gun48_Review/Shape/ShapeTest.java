package gunler.gun41_50.gun48_Review.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle("blue",3.5);
        Rectangle rectangle = new Rectangle("red",5,3);

        circle.displayInfo();
        circle.draw();
        System.out.println("circle.calculateArea() = " + circle.calculateArea());

        System.out.println("--------------------------------");

        rectangle.displayInfo();
        rectangle.draw();
        System.out.println("rectangle.calculateArea() = " + rectangle.calculateArea());
    }
}
