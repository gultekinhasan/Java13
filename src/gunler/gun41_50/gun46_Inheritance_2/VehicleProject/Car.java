package gunler.gun41_50.gun46_Inheritance_2.VehicleProject;

public class Car extends Vehicle {
    String model = "Unknown";

    public Car(String brand,String model){
        super();
        this.model=model;
        System.out.println("Inside Car Constructor with brand : "+ brand + " and model " + model);
    }

    public void honk(){
        System.out.println("Dut, Dut...");
    }
    public void displayInfo(){
        System.out.println("Brand: " + super.brand + ", Model :" + this.model );
    }

    public void startEngineWithMessage(){
        System.out.println("Car says :");
        super.startEngine();
    }

}
