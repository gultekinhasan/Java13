package gunler.gun51_62.gun51_AbstactClass.Sekil;

public class ShapeTest {
    public static void main(String[] args) {
        // Shape shape = new Shape(); // Shape class is an abstract class object of Shape can not be created
        Rectangle kare = new Rectangle("Kare");

        kare.setWidth(10);
        kare.setLength(10);

        System.out.println("kare.perimeter() = " + kare.perimeter());
        System.out.println("kare.area() = " + kare.area());

        kare.showInfo();
        System.out.println("kare.getName() = " + kare.getName());
        System.out.println("Shape.PI = " + Shape.PI);
        Shape.infoPI();
        System.out.println();

        Circle daire = new Circle("Daire",5);
        System.out.println("daire.perimeter() = " + daire.perimeter());
        System.out.println("daire.area() = " + daire.area());
        daire.showInfo();

    }
}