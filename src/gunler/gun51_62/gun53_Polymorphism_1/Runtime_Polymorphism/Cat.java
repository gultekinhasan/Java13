package gunler.gun51_62.gun53_Polymorphism_1.Runtime_Polymorphism;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("I am a Cat and I make sound like 'Miyav,miyav' ");
    }
    public void tirmala(){
        System.out.println("Ben bir kediyim ve kızarsam tırmlarım!!!");
    }
}
