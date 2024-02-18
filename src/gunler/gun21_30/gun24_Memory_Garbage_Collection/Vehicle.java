package gunler.gun21_30.gun24_Memory_Garbage_Collection;

public class Vehicle {
    String brandName;
    String model;
    int year;
    static int counter;

    public void finalize() {
        System.out.println(counter++);
        System.out.println("*** Garbage collection run. ***");
    }
}
