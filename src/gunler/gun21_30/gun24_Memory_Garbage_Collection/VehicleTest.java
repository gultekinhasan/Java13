package gunler.gun21_30.gun24_Memory_Garbage_Collection;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle();
        car1.brandName = "Toyota";
        car1.model = "Corolla";
        car1.year = 2023;

        System.out.println("car1 = " + car1);
        System.out.println("car1.brandName = " + car1.brandName);

        //     car1 = null;
        System.out.println("car1 = " + car1);
        //      System.out.println("car1.brandName = " + car1.brandName);


        for (int i = 0; i < 1000000; i++) {
            Vehicle vehicle = new Vehicle();
            System.out.println(vehicle);
        }
        //Garbage collection method
        System.gc(); //Request for GC to be invoked.
    }
}
