package gunler.gun51_62.gun52_Interface_Enum_Record.Shapeee;

public class Rectangle extends ShapeAbstract implements Shape{
    private int length;
    private int width;

    public Rectangle(String name, String color, int length, int width) {
        super(name, color);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int perimeter() {
        return 2*(length+width) ;
    }

    @Override
    public int area() {
        return length*width;
    }
}
