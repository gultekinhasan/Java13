package gunler.gun41_50.gun46_Inheritance_2.Bank;

public class BankTest {
    public static void main(String[] args) {

        Akbank akbank = new Akbank(1000.0);
        YapiKredi yapiKredi = new YapiKredi(1000.0);
        GarantiBank garantiBank = new GarantiBank(1000.0);

        System.out.println("Interest Rate from Akbank: " + akbank.getInterestRate() + "%  and New Balance: £" + akbank.calculateInterest());
        System.out.println("Interest Rate from Yapi Kredi: " + yapiKredi.getInterestRate() + "%  and New Balance: £" + yapiKredi.calculateInterest());
        System.out.println("Interest Rate from Garanti Bankasi: " + garantiBank.getInterestRate() + "%  and New Balance: £" + garantiBank.calculateInterest());
    }
}
