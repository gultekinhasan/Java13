package gunler.gun41_50.gun45_Inheritance_1.VehicleProject;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle veh1 = new Vehicle();

        veh1.model="Motor";
        veh1.brand="Arac Markası";
        veh1.year= 2021;

        System.out.println("veh1.model = " + veh1.model);
        System.out.println("veh1.year = " + veh1.year);

        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.println();

        Car veh2 = new Car();

        veh2.brand="Ford";
        veh2.model="S-Max";
        veh2.seats=7;
        veh2.light=true;
        veh2.weight=1500;
        veh2.year=2010;

        veh2.numberOfDoors=4;
        veh2.tyreSize=3;

        System.out.println(veh2.toString());

        veh2.start();
        veh2.move();
        veh2.honk();
        veh2.openTrunk();
        veh2.stop();

        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.println();

        Plane veh3 =new Plane();
        veh3.brand="Boeing";
        veh3.model="737";
        veh3.seats=200;
        veh3.light=false;
        veh3.weight=15000;
        veh3.year=2020;
        veh3.propellerSize=3;
        veh3.EngineType="Jet";

        System.out.println(veh3.toString());

        veh3.start();
        veh3.taxi();
        veh3.checkPressure(1000);
        veh3.stop();




    }
}
