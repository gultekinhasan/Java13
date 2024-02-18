package gunler.gun41_50.gun45_Inheritance_1.VehicleProject;

public class Car extends Vehicle {
    int tyreSize;
    int numberOfDoors;

    public void honk(){
        System.out.println("The car started honk the horn");
    }

    public void openTrunk(){
        System.out.println("The car's Trunk is open");
    }

    @Override
    public String toString() {
        return "Car{" +
                "tyreSize=" + tyreSize +
                ", numberOfDoors=" + numberOfDoors +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", weight=" + weight +
                ", seats=" + seats +
                ", light=" + light +
                '}';
    }
}
