package gunler.gun41_50.gun41_Encapsulation_2.Banka;
import java.util.ArrayList;

public class Banka {
    private String name;
    private String address;

    private ArrayList<Customer> customers;

    public Banka(String name, String address) {
     /*   this.name = name;
        this.address = address;
      */
        setName(name);
        setAddress(address);
        customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public String getAddress() {
        return address.trim();
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Customer> getCustomers() {
        // return customers;
        return new ArrayList<>(customers);
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public void addCustomer(Customer customer){
        this.customers.add(customer);
    }
    public void findCustomerByName(String name){
        //Not implemented
    }
    public void findCustomerByAccountNumber(String accountNumber){
        //Not implemented
    }

    public void listAllCustomers(){
        //Not implemented
    }
    @Override
    public String toString() {
        String str = "";
        str += "Name of the Bank    : " + this.name + "\n";
        str += "Address of the Bank : " + this.address + "\n";
        str += "Customers of the bank " + "\n";
        str += "----------------------------------------------\n";

        for (Customer customer : getCustomers()){
            str += customer.toString();
        }
        return str;
    }
}
