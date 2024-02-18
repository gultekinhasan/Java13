package gunler.gun51_62.gun52_Interface_Enum_Record.Shapeee;

public class Circle extends ShapeAbstract implements Shape {
    private int radius;

    public Circle(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public int perimeter() {
        return 2*(int) PI*radius ;
    }

    @Override
    public int area() {
        return (int) (Math.pow(radius,2) *PI);
    }
}
