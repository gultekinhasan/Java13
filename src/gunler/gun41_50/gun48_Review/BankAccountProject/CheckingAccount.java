package gunler.gun41_50.gun48_Review.BankAccountProject;

public class CheckingAccount extends BankAccount{
    private double overdraftLimit;
    public CheckingAccount(String accountNumber, double initialBalance,double overdraftLimit){
        super(accountNumber,initialBalance);
        this.overdraftLimit=overdraftLimit;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Overdraft Limit  : " + overdraftLimit);
    }

    @Override
    public void withdraw(double amount) {
        if (amount>0 && super.getBalance()-amount>= -overdraftLimit){
            super.withdraw(amount);
        }else {
            System.out.println("sss");
        }
    }
}
