package gunler.gun51_62.gun52_Interface_Enum_Record.AnimalFarm;

public class Fish extends Animal implements Swimmable{
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("i am a fish and i eat plankton and smaller fishes then me");
    }

    @Override
    public void sleep() {
        System.out.println("i'm a fish and i sleep in the water");
    }

    @Override
    public void printInfo() {
        System.out.println("My name :" + getName());
        System.out.println("My age  :" + getAge());
    }

    @Override
    public void swim() {
        //Implementation of interface method
        System.out.println("I am a fish and I swim in sea.");
    }
}
