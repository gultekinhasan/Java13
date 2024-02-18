package gunler.gun41_50.gun45_Inheritance_1.VehicleProject;

public class Vehicle {
    String brand;
    String model;
    int year;
    double weight;
    int seats;
    boolean light = false;


    public void start (){
        System.out.println("The Vehicle has started working");
    }
    public void stop (){
        System.out.println("The Vehicle has stopped working");
    }
    public void move (){
        System.out.println("The Vehicle has started moving");
    }
    public boolean turnLightOn (){
        return light;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", weight=" + weight +
                ", seats=" + seats +
                ", light=" + light +
                '}';
    }
}
