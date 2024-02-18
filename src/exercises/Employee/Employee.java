package exercises.Employee;

public abstract class Employee {
    private int id;
    private String firstName;
    private String lastName;

    public Employee(int id, String firstName, String lastName) {
        setId(id);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id>0 && id<100){
            System.out.println("geçersiz id");
        }else{
            this.id = id;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
