package gunler.gun41_50.gun46_Inheritance_2.AnimalProject;

public class Dog extends Animal{

    // Sub Class default constructor
    public Dog(){
        // Implicit call to derfault super class constructor
        //super();
        System.out.println("Inside Dog default constructor");
    }

    // Sub Class parameterised constructor
    public Dog(String sound){
        super(sound);
        System.out.println("Inside Dog parameterised constructor with sound : " + sound);
    }

    // Sub Class parameterised constructor with 2 parameters
    public Dog(String sound, int age){
        // this(sound); // both this() and super() should be in the first line of the constructor
        // hence ve cannot use both constructor call in same child constructor
        super(sound,age);
        System.out.println("Inside Dog parameterised constructor with sound : " + sound + " age is " + age);
        // super(sound,age); // Always should be in the first line of child constructor
    }

    public void bark(){
        System.out.println("Dog is barking");
    }
}
