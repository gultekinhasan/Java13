package gunler.gun41_50.gun50_Composition.CAR;

public class Steering {
    private int size;

    public Steering(int size){
        this.size = size;
    }

    public void turn(int degree, String way){
        System.out.println("Turning steering wheel by " + degree + " degres to " + way + " with " + size + " cm size");
    }
}
