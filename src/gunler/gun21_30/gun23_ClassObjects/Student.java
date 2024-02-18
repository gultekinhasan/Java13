package gunler.gun21_30.gun23_ClassObjects;

public class Student {
    // Template Student class i olusturun
    // Her bir ogrenci; name, surname, className, schoolNumber, age, weigth
    // Her bir ogrenci; study(), code(), eat(), sport()

    public String name;
    public String surname;
    public String className;
    public long schoolNumber;
    public int age;
    public double weight;


    public void study(){
        System.out.println("studying...");
    }

    public void code(){
        System.out.println("coding...");
    }

    public void eat(){
        System.out.println("eating...");
    }

    public void sport(){
        System.out.println("doing sport...");
    }
}
