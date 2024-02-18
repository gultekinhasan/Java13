package gunler.gun31_40.gun39_Review.Project;

public class EmployeeTest {

    public static void main(String[] args) {
        ManagementSystem managementSystem = new ManagementSystem();

        Employee emp1 = new Employee(11111,"Ahmet K.",5000.0);
        Employee emp2 = new Employee(11112,"Hasan G.",7000.0);
        Employee emp3 = new Employee(11113,"Behzat C.",4000.0);

        managementSystem.addEmployee(emp1);
        managementSystem.addEmployee(emp2);
        managementSystem.addEmployee(emp3);

        System.out.println("All employees :");
        managementSystem.displayEmployees();

        System.out.println("Removing employees :");
        managementSystem.removeEmployee(11111);
        managementSystem.displayEmployees();

        System.out.println();

        System.out.println("Displaying single Employee :");
        managementSystem.getEmployee(11112);
        managementSystem.displayEmployees();


    }
}
