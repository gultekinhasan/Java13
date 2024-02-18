package SelfProjects.SDET_Project;

public class SDET_Company {

    String company;

    double salary;

    boolean isSuccessful;

    SDET_Employee employee;



    public SDET_Company(){
        this.company = "Not Defined";
        this.salary  = 0;
        this.isSuccessful=false;
        this.employee= new SDET_Employee();

    }
    public SDET_Company(String company){
        this();
        this.company=company;
    }
    public SDET_Company(String company,double salary){
        this(company);
        this.salary=salary;
    }
    public SDET_Company(String company,double salary, boolean isSuccessful,SDET_Employee employee){
        this(company, salary);
        this.employee=employee;
        this.isSuccessful=isSuccessful;
    }
    public double getSalary() {
        return salary;
    }
    public String getCompany() {
        return company;
    }
    public boolean getIsSuccessful(){
        return isSuccessful;
    }
    public void increaseSalary (double raiseAmount){
        this.salary = raiseAmount;
        System.out.println("New salary is : " + raiseAmount);
    }
    public void changeCompany (String newCompany){
        this.company =newCompany;
        System.out.println("New company is : " + newCompany);
    }

    @Override
    public String toString() {
        return "company = " + company + "\t" +" salary = " + salary +  "\t" +" isSuccessful = " + isSuccessful + "\n"+
                "employee=" + employee + "\n" ;
    }

}

