package exercises.Employee;

public class PartTimeEmployee extends Employee {
    private double hourlyPay;


    public PartTimeEmployee(int id, String firstName, String lastName,double hourlyPay) {
        super(id, firstName, lastName);
        this.hourlyPay=hourlyPay;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public double calculateWeeklyPay(){
        return (getHourlyPay()*6)*6;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "hourlyPay=" + hourlyPay +
                '}';
    }
}
