package gunler.gun41_50.gun41_Encapsulation_2.Banka;
import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Account> accounts;//Holds customer accounts

    public Customer(String name) {
        // this.name = name;
        setName(name);
        setAccounts(new ArrayList<>());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

   /* public ArrayList<Account> getAccounts() {
        return accounts;
    }*/

    public ArrayList<Account> getAccounts() {
        return new ArrayList<>(accounts);
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public void depositMoney(Account account, double ammount) {
        account.setBalance(ammount);
    }

    public void withdrawMoney(Account account, double ammount) {
        account.withdraw(ammount);
    }

    @Override
    public String toString() {
        String str = "";
        str += name + "\n";
        str += "\tAccounts of the customer \n";
        str += "\t--------------------------\n";
        for (Account account : getAccounts()){
            str += "\t" + account + "\n";
            str += "\n";
        }
        return str;
    }
}
