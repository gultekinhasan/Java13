package gunler.gun41_50.gun45_Inheritance_1.MultiLevelInheritance;

public class Parent extends GrandParent{

    public String lastname;

    public Parent (String name, String lastname){
        super(name);
        this.lastname=lastname;
    }
public void display(){
    System.out.println("the lastname  of parent is : " + lastname);
}

}
