package gunler.gun51_62.gun52_Interface_Enum_Record.Shapeee;

public class ShapeTest {
    public static void main(String[] args) {
        Circle daire = new Circle("Daire","Beyaz",3);
        System.out.println("daire.perimeter() = " + daire.perimeter());
        System.out.println("daire.area() = " + daire.area());
        System.out.println();

        Rectangle dikdortgen = new Rectangle("Dikdörtgen" ,"Kırımız",25,56);
        System.out.println("dikdortgen.perimeter() = " + dikdortgen.perimeter());
        System.out.println("dikdortgen.area() = " + dikdortgen.area());

        System.out.println("dikdortgen.getName() = " + dikdortgen.getName());
    }
}
