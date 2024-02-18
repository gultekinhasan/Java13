package gunler.gun41_50.gun46_Inheritance_2.ParentProject;

public class Child extends Parent {
    public void greet(){
        System.out.println("hello from child class");
    }
    public void displayInfo(String message){
        System.out.println("Child : " + message);
    }

       // The method must have the same name as in the super/parent class

       // public void greetings(){
       // System.out.println("hello from child class");
       // }

       // The method must have the same parameter as in the parent class

       /* public void displayInfo(String message,int age){
          System.out.println("Child : " + message);
       }*/



        // there must be is-a relationship

        // Access modifier : Needs to be same or more visible





}
