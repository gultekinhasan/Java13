package gunler.gun41_50.gun48_Review.BankAccountProject;

public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("AC4561235",10000,4.5);
        System.out.println("=== SAVINGS ACCOUNT ===");
        savingsAccount.displayInfo();
        savingsAccount.deposit(5000);
        savingsAccount.applyInterest();

        System.out.println();
        System.out.println("=== SAVINGS ACCOUNT ===");
        CheckingAccount checkingAccount =new CheckingAccount("SF15421",200000,5000);
        checkingAccount.displayInfo();
        checkingAccount.withdraw(26000);

    }
}
