package gunler.gun41_50.gun42_StaticClassMembers_1;

public class Student {
    String name;

    int age;

    int idNumber;

    static String school = "EuroTech";

    static int schoolNumber =1000;

       //    public Student(String name, int age, int idNumber, String school) {
       //    this.name = name;
       //    this.age = age;
       //    this.idNumber = idNumber;
       //    this.school = school;
       //    }


//    public Student(String name, int age, int idNumber) {
//        this.name = name;
//        this.age = age;
//        this.idNumber = idNumber;
//    }


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        schoolNumber++;
        this.idNumber=schoolNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", idNumber=" + idNumber +
                ", school='" + school + '\'' +
                '}';
    }
}
