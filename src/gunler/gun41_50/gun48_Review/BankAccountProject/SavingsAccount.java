package gunler.gun41_50.gun48_Review.BankAccountProject;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount (String accountNumber, double initialBalance, double interestRate){
        super(accountNumber,initialBalance);
        this.interestRate=interestRate;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Interest Rate : %  " + interestRate);
    }

    public void applyInterest(){
        double interest = getBalance() * interestRate/100;
        deposit(interest);
        System.out.println("Interest is applied. New balance ;  " + getBalance());
    }

}
