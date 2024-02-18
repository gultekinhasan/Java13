package gunler.gun41_50.gun47_AccessModifiers.ZOO;
//Dog class'ı Animal class'ını miras alan bir child class olduğundan ve Parent Class "sealed class" olarak tanımlandığından
//Dog class'ı ya "final" ya da "non-sealed" olarak tanımlanması gerekir.

//public final class Dog extends Animal {
public non-sealed class Dog extends Animal  {
    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    public void makeSound() {
        System.out.println("I am a dog. And I make sound like Hav-Hav.");
    }

    @Override
    public String toString() {
        return "I am a Dog " + super.toString();
    }

}
