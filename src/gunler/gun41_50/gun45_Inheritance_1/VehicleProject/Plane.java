package gunler.gun41_50.gun45_Inheritance_1.VehicleProject;

public class Plane extends Vehicle{
    int propellerSize;//pervane büyüklüğü
    String EngineType;

    public int checkPressure (int pressure){
        return pressure;
    }
    public void taxi (){
        System.out.println("The Plane is in taxi mood");
    }

    @Override
    public String toString() {
        return "Plane{" +
                "propellerSize=" + propellerSize +
                ", EngineType='" + EngineType + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", weight=" + weight +
                ", seats=" + seats +
                ", light=" + light +
                '}';
    }
}
