package gunler.gun31_40.gun39_Review;
public class StudentExample {

    public static void main(String[] args) {

        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22, "Computer Science");
        Student student3 = new Student(18);
        Student student4 = new Student();

        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
        student4.displayDetails();
    }
}