package gunler.gun41_50.gun46_Inheritance_2.AnimalProject;

public class AnimalTest {

    public static void main(String[] args) {

        // Default constructor // parent -> child
        Dog myDog = new Dog();

        // Parameterised constructor // parent -> child
        Dog myDog2 = new Dog("hav hav");

        // Parameterised constructor  with 2 parameters // parent -> child
        Dog myDog3 = new Dog("hav hav", 5);

        myDog.eat(); // inherited from parent
        myDog.bark(); // specific for child

        myDog2.eat();
        myDog2.bark();
    }
}
