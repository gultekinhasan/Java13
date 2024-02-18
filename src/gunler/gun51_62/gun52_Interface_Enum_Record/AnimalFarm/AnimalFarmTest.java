package gunler.gun51_62.gun52_Interface_Enum_Record.AnimalFarm;

public class AnimalFarmTest {
    public static void main(String[] args) {
        //Animal class is an abstract class therefor instance of Animal class can not be created
        // Animal animal = new Animal() ;

        Bird kus = new Bird("Cici kuş",5);
        kus.printInfo();
        kus.eat();
        kus.sleep();
        kus.fly();
        kus.swim();
        kus.run();

        System.out.println();
        Frog kurbaga = new Frog("Kermit",15);
        kurbaga.printInfo();
        kurbaga.run();
        kurbaga.sleep();
        kurbaga.swim();
        System.out.println();

        Fish balik = new Fish("Nemo",2);
        balik.printInfo();
        balik.eat();
        balik.sleep();
        balik.swim();


    }
}
