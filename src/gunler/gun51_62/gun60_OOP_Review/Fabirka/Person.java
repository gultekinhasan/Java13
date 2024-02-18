package gunler.gun51_62.gun60_OOP_Review.Fabirka;

public abstract class Person {
    //Encapsulation - Data Hiding - Defining properties as private and methods should be declared as public
    private String name;
    private int age;

    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void work();

    public abstract String showInfo();


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
