package gunler.gun51_62.gun59_Map;

import java.util.HashMap;
import java.util.Map;

public class Student {
    public String name;

    public int id;
    public double grade;

    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", grade=" + grade +
                '}';
    }



    class StudentMap{
        public static void main(String[] args) {

            Map<Integer,Student> studentMap =new HashMap<>();
            Student student1 = new Student("joe doe",1579,95.5);
            Student student2 = new Student("jane doe",2745,78.3);
            Student student3 = new Student("jim smith",3865,55.6);

            studentMap.put(student1.getId(),student1);
            studentMap.put(student2.getId(),student2);
            studentMap.put(student3.getId(),student3);

            System.out.println("Student with id 1579 : " + studentMap.get(1579));
            System.out.println("Student with id 2745 : " + studentMap.get(2745));
            System.out.println("Student with id 3865 : " + studentMap.get(3865));
            System.out.println("Student1 id          : " + studentMap.get(student1.getId()));
            System.out.println("Student2 grade       : " + studentMap.get(student2.getId()).getGrade());
            System.out.println("Student3 details     : " + studentMap.get(student3.getId()).toString());
        }
    }
}
