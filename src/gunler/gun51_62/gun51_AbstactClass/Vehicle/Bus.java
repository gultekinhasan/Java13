package gunler.gun51_62.gun51_AbstactClass.Vehicle;

public class Bus extends Vehicle{
    public Bus(String brand, String model, int year, String color) {
        super(brand, model, year, color);
    }

    @Override
    public void start() {
        System.out.println("Bus is Started");
    }

    @Override
    public void stop() {
        System.out.println("bus is stopped");
    }

    @Override
    public void drive() {
        System.out.println("bus is moving");
    }

    @Override
    public void turnRight(int angle) {
        System.out.println("bus is turning right with " + angle + "degree") ;
    }

    @Override
    public void turnLeft(int angle) {
        System.out.println("bus is turning left with " + angle + "degree") ;

    }
}
