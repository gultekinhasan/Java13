package gunler.gun41_50.gun41_Encapsulation_2.Banka;
import java.util.ArrayList;
import java.util.Arrays;
public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("TL","1234",100 );
        Account account2 = new Account("Pound","234235",1000 );
        Account account3 = new Account("Dolar","34",1000 );


        System.out.println("account1 = " + account1);
        System.out.println("account2 = " + account2);
        System.out.println("account3 = " + account3);

        System.out.println("account1.getTypes() = " + account1.getTypes());
        ArrayList<String> hesapTurler = account1.getTypes();

        System.out.println("hesapTurler = " + hesapTurler);
        hesapTurler.add("Armut");
        hesapTurler.add("Karpuz");
        System.out.println("hesapTurler = " + hesapTurler);
        System.out.println("account1.getTypes() = " + account1.getTypes());

        Account account4 = new Account("Armut","12323424",2324234);
        System.out.println("account4 = " + account4);

        Account account5 = new Account("Karpuz","3242",2324234);
        System.out.println("account5 = " + account5);

        System.out.println("account4.getTypes() = " + account4.getTypes());
        System.out.println("account5.getTypes() = " + account5.getTypes());



    }
}
