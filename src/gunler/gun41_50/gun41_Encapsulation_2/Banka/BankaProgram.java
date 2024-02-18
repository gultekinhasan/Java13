package gunler.gun41_50.gun41_Encapsulation_2.Banka;
import java.util.Scanner;

public class BankaProgram {
    public static void start(Banka banka){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("Name of the customer : ");
            String cName = scanner.nextLine();

            System.out.print("Type of the Account : ");
            String tAccount = scanner.nextLine();

            System.out.print("Number of the Account : ");
            String nAccount = scanner.nextLine();

            System.out.print("Initial balance of the Account : ");
            double balanceAccount = Double.parseDouble(scanner.nextLine());

            Account account = new Account(tAccount, nAccount, balanceAccount);
            Customer customer = new Customer(cName);
            customer.addAccount(account);
            banka.addCustomer(customer);

            System.out.print("Continue to add customer ? ");
            String cont = scanner.nextLine();

            if(cont.startsWith("N")){
                break;
            }
        }
    }

    public static void main(String[] args) {
        Banka banka = new Banka("ABC Investment Bank", "Wall street no : 1234 NewYork /USA");

        Account account1 = new Account("Dolar", "12345", 120);
        Account account2 = new Account("Euro", "2344", 500);

        Customer customer1 = new Customer("Ahmet Yatırımcı");
        customer1.addAccount(account1);
        customer1.addAccount(account2);

        Customer customer2 = new Customer("Dolar Investson");
        customer2.addAccount(new Account("Dolar", "5678", 12000));

        banka.addCustomer(customer1);
        banka.addCustomer(customer2);

        System.out.println(banka);

        start(banka);

        System.out.println("banka = " + banka);
    }
}
