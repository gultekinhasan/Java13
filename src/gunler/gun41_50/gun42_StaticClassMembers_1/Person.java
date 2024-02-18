package gunler.gun41_50.gun42_StaticClassMembers_1;
public class Person {

    private static String name;

    public Person(String name){
        this.name = name;
    }

    public void printName(){
        System.out.println("name : " + name);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Ahmet"); // Ahmet
        Person person2 = new Person("Ayse"); // Ayse

        person1.printName(); // Ahmet // static ==> Ayse
        person2.printName(); // Ayse // static ==> Ayse

        Person person3 = new Person("Ali"); // Ali
        person3.printName(); // Ali // static ==> Ali

        person1.printName(); // Ahmet // static ==> Ali
        person2.printName(); // Ayse // static ==> Ali

    }
}