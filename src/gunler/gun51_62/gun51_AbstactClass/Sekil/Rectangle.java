package gunler.gun51_62.gun51_AbstactClass.Sekil;

public class Rectangle extends Shape {
    private int length;
    private int width;


    public Rectangle(String name) {
        super(name);
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
    protected int perimeter() {
        return 2 * (length + width);
    }

    @Override
    protected int area() {
        return length * width;
    }

    @Override
    protected void showInfo(){
        System.out.println("I am Rectangle class.");
    }
}
