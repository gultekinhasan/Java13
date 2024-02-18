package gunler.gun41_50.gun45_Inheritance_1.EmployeeProject;

import gunler.gun41_50.gun45_Inheritance_1.EmployeeProject.Employee;

public class Lawyer extends Employee {
    String caseName;
    String caseStatus;

    public void joinCourt(){
        System.out.println("Lawyer is at Court");
    }

    public void submitClaim(){
        System.out.println("Lawyer has submitted the claim");
    }
}
