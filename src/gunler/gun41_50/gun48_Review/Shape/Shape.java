package gunler.gun41_50.gun48_Review.Shape;

public class Shape {
    String color;


    public Shape (String color){
        this.color=color;
        System.out.println("Inside Shape Constructor with Color " + this.color);
    }
    public void draw(){
        System.out.println("Drawing a shape");
    }
    public double calculateArea(){
        System.out.println("Calculating area of the shape");
        return 0;
    }
}
