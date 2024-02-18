package gunler.gun41_50.gun45_Inheritance_1.EmployeeProject;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name="Ahmet";
        emp1.employeeId=12345;
        emp1.leaveHoliday(5);

        Developer emp2 = new Developer();
        emp2.name="Mehmet";
        emp2.employeeId=54321;
        emp2.leaveHoliday(3);

        System.out.println("emp2.name = " + emp2.name);
        System.out.println("emp2.employeeId = " + emp2.employeeId);

        Lawyer emp3 = new Lawyer();
        emp3.name="Ayse";
        emp3.gender='F';
        emp3.raiseSalary();

        System.out.println("emp3.name = " + emp3.name);
        System.out.println("emp3.gender = " + emp3.gender);

        Secretary emp4 = new Secretary();
        emp4.name="Emine";
        emp4.officeName="HR";
        emp4.giveReport();
        emp4.resign();

        System.out.println("emp4.name = " + emp4.name);
        System.out.println("emp4.officeName = " + emp4.officeName);

    }
}
