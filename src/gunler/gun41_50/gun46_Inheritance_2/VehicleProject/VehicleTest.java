package gunler.gun41_50.gun46_Inheritance_2.VehicleProject;

public class VehicleTest {
    public static void main(String[] args) {
        // accessing parent constructor by super()
        Car myCar = new Car("Toyota","Corolla");

        //accessing parent variable by super.variable
        myCar.displayInfo();

        //accessing parent method by super.method()
        myCar.startEngineWithMessage();


    }
}
