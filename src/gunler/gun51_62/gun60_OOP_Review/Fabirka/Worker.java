package gunler.gun51_62.gun60_OOP_Review.Fabirka;

public class Worker extends Person{
    private String department;
    public Worker(String name, int age,String department) {
        super(name, age);
        setDepartment(department);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }




    @Override
    public void work() {

    }

    @Override
    public String showInfo() {
        return null;
    }
}
