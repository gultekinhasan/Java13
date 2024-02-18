package gunler.gun31_40.gun38_Constructors_PassingObjects_2;

public class Student {
        String name;
        int age;
        long id;

        public Student(){
            System.out.println("Default / NoArgs constructor");
            this.name ="Isimsiz ";
            this.age = 0;
            this.id = 1000;
        }
        public Student (String name){
            this.name=name;
        }
        public Student (int age){
            this.age=age;
        }
        public Student(long id){
            this.id=id;
        }
        public Student (String name,int age,long id){
            this.name = name;
            this.age = age;
            this.id = id;
        }
}
