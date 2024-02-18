package gunler.gun41_50.gun45_Inheritance_1.EmployeeProject;

import gunler.gun41_50.gun45_Inheritance_1.EmployeeProject.Employee;

public class Secretary extends Employee {
    String officeName;
    int managerId;
    public void giveReport(){
        System.out.println("Secretary prepared a report");
    }
    public void createList (){
        System.out.println("Secretary has created a list");
    }

}
