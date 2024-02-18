package gunler.gun51_62.gun53_Polymorphism_1.Runtime_Polymorphism;
import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {
        ArrayList<Animal> hayvanlar = new ArrayList<>();

        // Animal animal = new Animal() ; Animal is an abstract class object can not be created
        Dog dog = new Dog("Karabaş");
        Cat cat = new Cat("Mahur");
        Duck duck = new Duck("Varyemez");

        dog.makeSound();
        cat.makeSound();
        duck.makeSound();

        dog.printName();
        cat.printName();
        duck.printName();

        System.out.println();

        //animal is a polymorphic variable
        Animal animal = new Cat("PolyMorphic reference Cat");

        System.out.println("animal.getClass().getSimpleName() = " + animal.getClass().getSimpleName());
        animal.makeSound();
        animal.printName();

        System.out.println();

        animal = new Duck("PolyMorphic reference Duck");
        System.out.println("animal.getClass().getSimpleName() = " + animal.getClass().getSimpleName());
        animal.makeSound();
        animal.printName();
        //In order to call method which is special to child, we must down cast the parent type
        ((Duck) animal).fly();

        hayvanlar.add(cat);
        hayvanlar.add(dog);
        hayvanlar.add(duck);
        System.out.println();

        for (Animal a : hayvanlar) {
            a.printName();
            a.makeSound();
            if (a instanceof Cat) {
                ((Cat) a).tirmala();
            }
            if (a instanceof Duck) {
                ((Duck) a).fly();
            }
            System.out.println();
        }
        System.out.println();

        //Pattern matching
        for (Animal h : hayvanlar) {
            h.printName();
            h.makeSound();
            if (h instanceof Cat kedi) {
                kedi.tirmala();
            }
            if (h instanceof Duck ordek) {
                ordek.fly();
            }
            System.out.println();
        }
        System.out.println();

        //getClass()
        System.out.println("duck.getClass() = " + duck.getClass());

        //getClass().getName()
        System.out.println("duck.getClass().getName() = " + duck.getClass().getName());
        //getClass().getSimpleName()
        System.out.println("duck.getClass().getSimpleName() = " + duck.getClass().getSimpleName());
    }
}
