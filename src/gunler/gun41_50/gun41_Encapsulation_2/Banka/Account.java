package gunler.gun41_50.gun41_Encapsulation_2.Banka;
import java.util.ArrayList;
import java.util.Arrays;
public class Account {
    private String accountType;
    private String accountNumber;
    private double balance;
    private boolean isAvailable;

    //Static --> belongs to Class. Shared by all instances of Class
    private static ArrayList<String>  types =  new ArrayList<>(Arrays.asList("TL", "Euro", "Dolar"));;

    public Account(String accountType, String accountNumber, double balance) {
      /*
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.balance = balance;
        */
        isAvailable = false;

        setAccountType(accountType);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        if(accountType != null && types.contains(accountType)){
            this.accountType = accountType;
            isAvailable = true;
        }else {
            System.out.println(accountType + " türü tanımlı bir hesap türü olmadığından bu türde bir hesap açamazsınız!!!");
            System.out.println("Açabileceğiniz hesap türleri : " + types);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (isAvailable){
            this.accountNumber = accountNumber;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (isAvailable && balance >= 100) {
            this.balance += balance;
        }
    }
    public void deposit(int ammount){
        if(ammount > 0){
            this.balance += ammount;
        }
    }
    public void withdraw(double ammount){
        if( ammount > 0 && ammount <= balance){
            this.balance -= ammount;
        }
    }

   /*
    //Returning original reference address of field is security problem Clients may alter the field !!!.

    public ArrayList<String> getTypes() {
        return types; //returns original ArrayList reference. Which is problem. Client may change values or add elements.
    }

    */

    //Corrected way of returning copy of field with new reference address.(As a new object)
    //We can not return original address because the client will direct access using returned reference.
    //We always need to take a copy and return a new reference to it.

    public ArrayList<String> getTypes() {
        return new ArrayList<>(types);//returns new ArrayList. Clients may alter this field, but it does not affect original one
    }

    @Override
    public String toString() {
        String str = "";
        str += "Account Type   : " + getAccountType() + "\n";
        str += "\tAccount Number : " + getAccountNumber() + "\n";
        str += "\tBalance        : " + getBalance();
        return str;
    }
}
