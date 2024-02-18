package gunler.gun31_40.gun39_Review;
public class Student {

    public String name;
    public int age;
    public String department;


    public Student(String name, int age){
        this.name = name;
        this.age = age;
        this.department = "Not Assigned";
    }

    public Student(String name, int age, String department){
        this(name, age);
        this.department = department;
    }

    public Student(int age){
        this("Unknown", age);
    }

    public Student(){
        this(0);
    }

    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("\n");
    }

}
