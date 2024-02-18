package gunler.gun51_62.gun51_AbstactClass.Sekil;

public abstract class Shape {
    //Abstract class may have static variables
    protected static final double PI = 3.14;
    private String name;

    //Constructor
    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Generalisation
    //These are abstract methods. And, All child classes have to implement all abstract methods.
    protected abstract int perimeter();
    protected abstract int area();

    //Normal method
    //This is a non-abstract method. It is non-mandatory to be implemented in children classes
    //It may be overridden or not.
    protected void showInfo(){
        System.out.println("I am an abstract class.");
    }

    //Abstract class may have static method
    protected static void infoPI(){
        System.out.println("Abstract class PI : " + PI);
    }

    //Abstract class may have final method
    //Final methods can not be overridden bay child classes
    protected final void finalMethod(){
        System.out.println("Abstract class final method.");
    }
}