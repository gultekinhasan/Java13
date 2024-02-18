package gunler.gun21_30.gun26_Review;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car(); //Constructor call
        Car car2 = new Car(); //Constructor call

        car1.marka = "Honda";
        car1.model = "Accord";
        car1.engineType = "Benzin";

        car2.marka = "Mercedes";

        Car car3 = new Car("Toyota","Corolla","Benzin");

        String str = new String("Ali");
        System.out.println("str = " + str);

        car1.showInfo();
        System.out.println();

        car2.showInfo();
        System.out.println();

        car3.showInfo();

/*
        System.out.println("car3.marka = " + car3.marka);
        System.out.println("car3.model = " + car3.model);
        System.out.println("car3.engineType = " + car3.engineType);
*/
        car1.drive(1300);
        car2.drive(70);
        car3.drive(120);

        car1.stop();
        car3.turn("left",35);
        car2.turn("right",50);

        System.out.println("car1.getMarkaModel() = " + car1.getMarkaModel());
        String markasi = car3.getMarkaModel();
        System.out.println(markasi);
    }

}
