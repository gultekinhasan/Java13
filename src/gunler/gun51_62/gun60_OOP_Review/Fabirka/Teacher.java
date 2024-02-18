package gunler.gun51_62.gun60_OOP_Review.Fabirka;

public class Teacher extends Person {

    public Teacher(String name, int age) {
        super(name, age);
    }

    public void teach(){
        System.out.println("i'm a teacher and i teach lessons..");
    }
    @Override
    public void work() {
        System.out.println("i'm a teacher at firm");
    }

    @Override
    public String showInfo() {
        return this.getName() + " - " + this.getAge() + "  yasindayim.";
    }

}
