package gunler.gun51_62.gun54_Polymorphism_2;

public class InstanceOf {
    public static void main(String[] args) {

        Sekil sekil1 = new Kare();
        Sekil sekil2 = new Ucgen();
        Sekil sekil3 = new Daire();

        System.out.println("sekil1 objecti Kare Classinin bir instance i mi? " + (sekil1 instanceof Kare));

        if(sekil1 instanceof Kare){
            System.out.println("Kare");
        }if(sekil1 instanceof Ucgen){
            System.out.println("Ucgen");
        }if(sekil1 instanceof Daire){
            System.out.println("Daire");
        }
    }
}
