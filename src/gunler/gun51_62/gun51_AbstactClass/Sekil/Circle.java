package gunler.gun51_62.gun51_AbstactClass.Sekil;

public class Circle extends Shape {
    private int radius;

    public Circle(String name, int radius) {
        super(name);
        setRadius(radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if(radius > 0 && radius <= 100){
            this.radius = radius;
        }else radius = 1;
    }

    @Override
    protected int perimeter() {
        return (int) (2 * Shape.PI * radius);
    }

    @Override
    protected int area() {
        return (int) (radius * radius * Shape.PI);
    }

    public void showInfo(){
        System.out.println("I am a Circle class.");
    }
}