package exercises.Employee;

public class FullTimeEmployee extends Employee{
    private double annualSalary;

    public FullTimeEmployee(int id, String firstName, String lastName,double annualSalary) {
        super(id, firstName, lastName);
        this.annualSalary=annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public double calculateMonthlyPay(){
       return  getAnnualSalary() / 12;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "annualSalary=" + annualSalary +
                '}';
    }
}



