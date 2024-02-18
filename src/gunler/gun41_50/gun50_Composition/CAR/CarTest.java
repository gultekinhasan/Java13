package gunler.gun41_50.gun50_Composition.CAR;

public class CarTest {
    public static void main(String[] args) {

        Engine engine = new Engine(250);
        Transmission transmission = new Transmission(6);
        Steering steering = new Steering(30);

        Car car = new Car(engine, transmission, steering, 4, 2);

        // car.drive();

        car.drive(1, 15, "right");
    }
}
