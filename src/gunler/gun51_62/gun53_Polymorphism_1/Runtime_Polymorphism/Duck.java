package gunler.gun51_62.gun53_Polymorphism_1.Runtime_Polymorphism;

public class Duck extends Animal {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void printName() {
        // super.printName();
        System.out.println("Duck class printName Metodu çalıştı.");
        System.out.println(getName().toUpperCase());
    }

    @Override
    void makeSound() {
        System.out.println("I am a Duck and I make sound like 'Vak,Vak' ");
    }
    public void fly(){
        System.out.println("I am a duck and I fly.");
    }
}
