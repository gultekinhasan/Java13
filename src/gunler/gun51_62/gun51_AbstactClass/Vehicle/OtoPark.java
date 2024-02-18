package gunler.gun51_62.gun51_AbstactClass.Vehicle;

import java.util.ArrayList;

public class OtoPark {
    private String name;
    private String address;

    private ArrayList<Vehicle> vehicles;

    public OtoPark(String name, String address) {
        this.name = name;
        this.address = address;
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }
    public void listOfVehicles(){
        System.out.println(name);
        System.out.println(address);
        System.out.println("---------------------------------------");
        System.out.println("Otoparkta toplam " + vehicles.size() + " araç var.");
        System.out.println("Otoparktaki araçların listesi");
        System.out.println("---------------------------------------");

        for (Vehicle vehicle: vehicles){
            System.out.println(vehicle);
        }
    }
    public void numberOfVehiclesByType(){
        int sedan = 0;
        int bus = 0;

        for (Vehicle vehicle: vehicles){
            if(vehicle instanceof Sedan){
                sedan++;
            }
            if(vehicle instanceof Bus){
                bus++;
            }
        }
        System.out.println("Numbers of Sedan type vehicle is " + sedan);
        System.out.println("Numbers of Bus type vehicle is " + bus);
    }
}
