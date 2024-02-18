package gunler.gun21_30.gun23_ClassObjects;

public class CakeTest {
    public static void main(String[] args) {

        Cake cake1 = new Cake();
        cake1.cakeMaker = "Ahmet";
        cake1.isEgg = true;
        cake1.weight = 2;
        // cake1.slices = 10;

        Cake cake2 = new Cake();
        cake2.cakeMaker = "Ayse";
        cake2.isEgg = false;
        cake2.weight = 3;
        // cake2.slices = 10;

        cake1.eat(); // Ahmet's cake slices = 9 - cakeSlices = 9
        cake1.eat(); // Ahmet's cake slices = 8 - cakeSlices = 8
        cake2.eat(); // Ayse's cake slices = 9  - cakeSlices = 7
    }
}
