package gunler.gun51_62.gun53_Polymorphism_1.Runtime_Polymorphism;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void printName(){
        System.out.println("Parent class printName metodu");
        System.out.println("Name = " + name);
    }
    abstract void makeSound();
}
