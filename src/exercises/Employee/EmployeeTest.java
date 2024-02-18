package exercises.Employee;

public class EmployeeTest {
    public static void main(String[] args) {

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(198,"Hasan","Gultekin",58500);
        FullTimeEmployee fullTimeEmployee1 = new FullTimeEmployee(199,"Sukru","Yuksel",65500);

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(200,"Emre","Varli",18.77);
        PartTimeEmployee partTimeEmployee1 = new PartTimeEmployee(201,"Aydin","Cakmak",17.50);

        System.out.println("fullTimeEmployee.calculateMonthlyPay() = " + fullTimeEmployee.calculateMonthlyPay());
        System.out.println("fullTimeEmployee1.getAnnualSalary() = " + fullTimeEmployee1.getAnnualSalary());
        System.out.println();
        System.out.println("partTimeEmployee.calculateWeeklyPay() = " + partTimeEmployee.calculateWeeklyPay());
        System.out.println(partTimeEmployee1.toString());
    }
}