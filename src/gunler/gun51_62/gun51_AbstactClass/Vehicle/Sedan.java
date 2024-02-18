package gunler.gun51_62.gun51_AbstactClass.Vehicle;

public class Sedan extends Vehicle{
    public Sedan(String brand, String model, int year, String color) {
        super(brand, model, year, color);
    }

    @Override
    public void start() {
        System.out.println(getBrand() + " car is Started");

    }

    @Override
    public void stop() {
        System.out.println( getBrand() + "car is stopped");

    }

    @Override
    public void drive() {
        System.out.println(getBrand() +"car is moving");

    }

    @Override
    public void turnRight(int angle) {
        System.out.println( getBrand()+" car is turning right with " + angle + "degree") ;

    }

    @Override
    public void turnLeft(int angle) {
        System.out.println(getBrand() + " car is turning left with " + angle + "degree") ;

    }
}
