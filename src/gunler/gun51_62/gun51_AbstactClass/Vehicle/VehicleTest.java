package gunler.gun51_62.gun51_AbstactClass.Vehicle;

public class VehicleTest {
    public static void main(String[] args) {
        Bus bus = new Bus("Mercedes","Maraton",2021,"white");

        bus.start();
        bus.drive();
        bus.turnRight(45);
        System.out.println(bus.toString());


        Sedan sedan = new Sedan("Honda","Accord",2015,"black");

        sedan.start();
        sedan.drive();
        sedan.turnLeft(15);
        sedan.stop();
        System.out.println("sedan.getYear() = " + sedan.getYear());
        System.out.println("sedan.toString() = " + sedan.toString());


    }
}
