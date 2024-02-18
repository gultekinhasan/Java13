package gunler.gun41_50.gun50_Composition.CAR;

public class Car {

    private Engine engine;
    private Transmission transmission;
    private Steering steering;
    private int wheels;
    private int doors;

    public Car(Engine engine, Transmission transmission, Steering steering, int wheels, int doors){
        this.engine = engine;
        this.transmission = transmission;
        this.steering = steering;
        this.wheels = wheels;
        this.doors = doors;
    }

    public void drive(int gear, int degree, String way){
        engine.start();
        transmission.shiftGear(gear);
        steering.turn(degree, way);
        System.out.println("Driving car with " + doors + " doors and " + wheels + " wheels");
    }

}
