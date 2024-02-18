package gunler.gun41_50.gun46_Inheritance_2.PersonProject;

public class PersonTest {

    public static void main(String[] args) {

        Student student = new Student();
        student.study(); // method in child class
        student.commonTask(); // method inherited from parent class
        student.introduce(); // method overriding / specific implementation for child class of a method from parent class
    }
}
