package gunler.gun31_40.gun39_Review.Project;

import java.util.ArrayList;

public class ManagementSystem {
    ArrayList<Employee> employeeList = new ArrayList<>();

    public void addEmployee (Employee employee){
        employeeList.add(employee);
        System.out.println("Employee added successfully.");
    }

    public void removeEmployee (int employeeId){
        for (Employee employee:employeeList){
            if (employee.getId()==employeeId){
                employeeList.remove(employee);
                System.out.println("Employee removed successfully.");
                return;
            }
        }
        System.out.println("Employee not found with ID : "+ employeeId);
    }

    public void getEmployee (int getEmployee){
        for (Employee employee:employeeList){
            if (employee.getId()==getEmployee){
                employeeList.add(employee);
                return;
            }
        }
        System.out.println("Employee not found with ID : "+ getEmployee);
    }

    public void displayEmployees(){
        for (Employee employee: employeeList){
            System.out.println(employee);
        }
    }
}
