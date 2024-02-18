package gunler.gun41_50.gun48_Review.Shape;

public class Circle extends Shape{

    double radius;

    public Circle(String color,double radius){
        super(color);
        this.radius=radius;
        System.out.println("Inside circle constructor with color  "+ this.color +" and radius "+ this.radius);
    }

    public void draw(){
        System.out.println("Drawing a circle");
    }

    public double calculateArea(){
        return Math.PI*this.radius*this.radius;
    }
    public double calculateArea(double radius){
        return Math.PI * radius * radius;
    }
    public void displayInfo(){
        System.out.println("color : " + super.color + ", Radius : " + this.radius);
    }

}
