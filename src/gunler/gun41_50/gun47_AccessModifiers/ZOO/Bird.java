package gunler.gun41_50.gun47_AccessModifiers.ZOO;
//Bird class'ı Animal class'ını miras alan bir child class olduğundan ve Parent Class "sealed class" olarak tanımlandığından
//Bird class'ı ya "final" ya da "non-sealed" olarak tanımlanması gerekir.

//public final class Bird extends Animal {
public non-sealed class Bird extends Animal {
    public Bird() {
    }

    public Bird(String name, int age, String color) {
        super(name, age, color); //Protected constructor
    }

    @Override
    public void move() {
        // super.move();
        System.out.println("I am a bird. And I can run with my two legs.");
    }

    @Override
    public void makeSound() {
        System.out.println("I am a bird. And I make sound like Cik-Cik.");
    }

    public void fly() {
        System.out.println("I am a bird. And I fly with my wings.");
    }

    @Override
    public String toString() {
        return "I am a bird " + super.toString();
    }
}
