package gunler.gun21_30.gun23_ClassObjects;
public class Cake {
    String cakeMaker;
    int slices = 10;
    boolean isEgg;
    double weight;
    static int cakeSlices = 10;

    public void eat(){
        slices--;
        System.out.println(cakeMaker + "'s cake slices = " + slices);
        cakeSlices--;
        System.out.println("cakeSlices = " + cakeSlices);
    }
}
