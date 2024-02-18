package gunler.gun51_62.gun60_OOP_Review.Fabirka;

public class Engineer extends Person{
    private String university;
    public Engineer(String name, int age , String university) {
        super(name, age);
        setUniversity(university);
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void design(){
        System.out.println("i'm an engineer and i design products");
    }

    @Override
    public void work() {

    }

    @Override
    public String showInfo() {
        return this.getName() + " - " + this.getAge() + "  yasindayim ve " + this.getUniversity() + " mezunuyum..";
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "university='" + university + '\'' +
                '}' + super.toString();
    }
}
