package gunler.gun51_62.gun51_AbstactClass.Vehicle;

public class OtoParkTest {
    public static void main(String[] args) {
        OtoPark otoPark = new OtoPark("Public park", "Madam Tousso street #4567 London");
        Sedan sedan1 = new Sedan("Mercedes","CKL 250",2023, "Black");
        Sedan sedan2 = new Sedan("TOGG","TX100",2023, "White");
        Sedan sedan3 = new Sedan("Ford","Taunus",1998, "Green");

        Bus bus = new Bus("Mercedes","Maraton",2015,"Silver");

        otoPark.addVehicle(sedan1);
        otoPark.addVehicle(sedan2);
        otoPark.addVehicle(sedan3);
        otoPark.addVehicle(bus);

        otoPark.listOfVehicles();
        System.out.println();
        otoPark.numberOfVehiclesByType();
    }
}
