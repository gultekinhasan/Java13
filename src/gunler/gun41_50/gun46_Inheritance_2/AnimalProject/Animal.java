package gunler.gun41_50.gun46_Inheritance_2.AnimalProject;

public class Animal {

    // Super Class default constructor
    public Animal(){
        System.out.println("Inside Animal default constructor");
    }

    // Super Class parameterised constructor
    public Animal(String sound){
        System.out.println("Inside Animal parameterised constructor with sound : " + sound);
    }

    // Super Class parameterised constructor with 2 parameters
    public Animal(String sound, int age){
        System.out.println("Inside Animal parameterised constructor with sound : " + sound + " age is " + age);
    }

    public void eat(){
        System.out.println("Animal is eating");
    }
}