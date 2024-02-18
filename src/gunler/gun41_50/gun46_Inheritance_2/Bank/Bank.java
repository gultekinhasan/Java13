package gunler.gun41_50.gun46_Inheritance_2.Bank;

public class Bank {
    public double balance;

    public Bank(double balance){
        this.balance = balance;
    }

    public double getInterestRate(){
        return 0.0;
    }

    public double calculateInterest(){
        double insterestRate = this.getInterestRate();
        double interest = balance * (insterestRate/100);
        this.balance += interest;
        return this.balance;
    }
}
