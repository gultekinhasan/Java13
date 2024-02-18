package gunler.gun51_62.gun53_Polymorphism_1.Runtime_Polymorphism;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    //Dog is-an animal
    @Override
    void makeSound() {
        System.out.println("I am a Dog and I make sound like 'Hav,hav' ");
    }

}
