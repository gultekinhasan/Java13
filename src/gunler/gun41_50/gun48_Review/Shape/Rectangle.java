package gunler.gun41_50.gun48_Review.Shape;

public class Rectangle extends Shape{
    double length;
    double width;

    public Rectangle(String color, double length,double width){
        super(color);
        this.length=length;
        this.width=width;
        System.out.println("Inside Rectangle Constructor with color : " + this.color + ", length " + this.length + ", width " + this.width);

    }
    public void draw(){
        System.out.println("Drawing a Rectangle");
    }

    public double calculateArea(){
        return this.length*this.width;
    }

    public void displayInfo(){
        System.out.println("color : " + super.color + ", Length : " + this.length + ", width " + this.width);
    }

}
