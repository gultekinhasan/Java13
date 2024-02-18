package gunler.gun41_50.gun42_StaticClassMembers_1;

public class DinnerTest {
    public static void main(String[] args) {
        Dinner dad = new Dinner();
        Dinner mom = new Dinner();
        Dinner kid = new Dinner();

        dad.takeSlice();
        System.out.println("Dinner.pizzaSlice = " + Dinner.pizzaSlice);
        //System.out.println("dad = " + dad.pizzaSlice);
        //        System.out.println("mom = " + mom.pizzaSlice);
        //        System.out.println("kid = " + kid.pizzaSlice);

        mom.takeSlice();
        System.out.println("Dinner.pizzaSlice = " + Dinner.pizzaSlice);

        kid.takeSlice();
        System.out.println("Dinner.pizzaSlice = " + Dinner.pizzaSlice);

        dad.takeSlice(3);
        System.out.println("Dinner.pizzaSlice = " + Dinner.pizzaSlice);
    }
}
