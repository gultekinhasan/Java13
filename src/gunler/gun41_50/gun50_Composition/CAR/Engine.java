package gunler.gun41_50.gun50_Composition.CAR;

public class Engine {
    private int horsepower;
    public Engine(int horsepower){
        this.horsepower = horsepower;
    }
    public void start(){
        System.out.println("Engine started with " + horsepower + " horsepower");
    }
}
