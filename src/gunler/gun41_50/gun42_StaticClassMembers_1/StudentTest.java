package gunler.gun41_50.gun42_StaticClassMembers_1;

public class StudentTest {
    public static void main(String[] args) {
//        Student student1 =new Student("Mehmet",15,1000,"EuroTech");
//        Student student2 =new Student("Osman",16,1001,"EuroTech");
//        Student student3 =new Student("Elif",17,1002,"CyberTech");


        Student student1 = new Student("Mehmet", 15);
        Student student2 = new Student("Osman", 16);
        Student student3 = new Student("Elif", 17);
        Student student4 = new Student("Emine", 18);


        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println(student4.toString());

        System.out.println("*********************");
        // static variable a class name ile doğrudan ulaşabilmek mümkün..
        Student.school = "Another School";
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println(student4.toString());

        System.out.println();
        //Integer class ornek
        System.out.println(Integer.MAX_VALUE);

        //Math class ornek
        System.out.println(Math.PI);



    }


}
