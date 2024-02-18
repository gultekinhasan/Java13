package gunler.gun41_50.gun45_Inheritance_1.EmployeeProject;

public class Employee {
    String name ;
    int employeeId;
    double salary;
    int workHours;
    int vacationDay;
    char gender;

    public void raiseSalary (){
        System.out.println("Applied for increase salary");
    }
    public void leaveHoliday (int day){
        System.out.println("Asked for "+day+" holiday." );
    }
    public void resign (){
        System.out.println("asked for resign");
    }
}
