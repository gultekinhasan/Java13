package gunler.gun51_62.gun52_Interface_Enum_Record.AnimalFarm;

public class Frog extends Animal implements Runnable, Swimmable{
    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        //Implementation of interface method
        System.out.println("I am a frog and I eat tiny animals(flies) and worms");
    }

    @Override
    public void sleep() {
        //Implementation of interface method
        System.out.println("I am a frog and I sleep under rocks.");
    }

    @Override
    public void run() {
        //Implementation of interface method
        System.out.println("I am frog and I run like I am hoping.");
    }
    @Override
    public void swim() {
        //Implementation of interface method
        System.out.println("Whenever I need, I can swim in water.");
    }
    @Override
    public void printInfo() {
        System.out.println("My name :" + getName());
        System.out.println("My age  :" + getAge());
    }
}
