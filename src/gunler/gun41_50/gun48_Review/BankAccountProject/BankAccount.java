package gunler.gun41_50.gun48_Review.BankAccountProject;

public class BankAccount {
    private String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber,double initialBalance){
        this.accountNumber=accountNumber;
        this.balance=initialBalance;
    }
    public void displayInfo(){
        System.out.println("accountNumber = " + accountNumber);
        System.out.println("balance = " + balance);
    }

    public void deposit(double amount){
        if (amount>0){
            this.balance += amount;
            System.out.println("Deposit successful, New Balance :  " + balance);
        }else{
            System.out.println("invalid deposit amount");
        }
    }

    public void withdraw(double amount){
        if (amount>0 && amount<=balance){
            this.balance-=amount;
            System.out.println("Withdraw successful, New Balance :  " + amount);
        }else{
            System.out.println("invalid withdrawal amount or insufficient balance");
        }
    }

 public double getBalance(){
        return balance;
    }

}
