package gunler.gun51_62.gun52_Interface_Enum_Record.AnimalFarm;

public class Bird extends Animal implements Flyable,Swimmable,Runnable {


    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("i'm a bird and i eat tiny insects");
    }

    @Override
    public void sleep() {
        System.out.println("i'm a bird and i sleep on trees");
    }

    @Override
    public void printInfo() {
        System.out.println("My name :" + getName());
        System.out.println("My age  :" + getAge());
    }

    public void fly(){
        //Implementation of interface method
        System.out.println("I am bird and I fly my wings.");
    }

    @Override
    public void swim() {
//Implementation of interface method
        System.out.println("I am a bird and I can swim.");
    }
    @Override
    public void run() {
        System.out.println("I am a bird I can run my two legs.");
    }
}
