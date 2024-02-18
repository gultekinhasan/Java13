package gunler.gun41_50.gun45_Inheritance_1.MultiLevelInheritance;

public class Child extends Parent {
    public int age ;
    public Child (String name,String lastname, int age){
        super(name,lastname);
        this.age=age;
    }
    public void display(){
        System.out.println("Age of child is ; " + age);

    }
}
