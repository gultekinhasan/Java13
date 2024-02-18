package gunler.gun41_50.gun48_Review.AccessModifiers;

public class Person {
    //Modify access modifiers according to the task

    //Field to store the name of the Person
    //Accessible only within the class
    private String name;

    //Field to store the age of the person
    //Accessible from any class in the same package
    //not accessible from classes in other class
    int age;

    //Field to store yhe gender of person
    //Accessible from any class that is a subclass of Person
    protected char gender;

    //Method to display the details of the person
    //Accessible from any class in the same package
    //Not accessible from classes in other package
    void displayDetails(){
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
    }


    //Method to change the name of the person
    //Accessible only within the Person class
    private void changeName(String name){
        this.name = name;
    }


    //    public void setName(String name) {
//        this.name = name;
//    }

}
