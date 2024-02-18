package gunler.gun41_50.gun50_Composition.CAR;

public class Transmission {
    private int gears;

    public Transmission(int gears){
        this.gears = gears;
    }

    public void shiftGear(int gear){
        System.out.println("Shifting to gear " + gear + " out of " + gears);
    }
}
