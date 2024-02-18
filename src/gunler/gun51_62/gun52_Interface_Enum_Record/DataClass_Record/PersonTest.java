package gunler.gun51_62.gun52_Interface_Enum_Record.DataClass_Record;
import java.util.ArrayList;

public class PersonTest {
    public static void main(String[] args) {
        //Normal classic class
        ArrayList<Address> addresses = new ArrayList<>();
        addresses.add(new Address("Normal Street", "London", AddressEnum.HOME));

        Person person = new Person("Ahmet"
                , "Falanca"
                , "216-456 6789",
                addresses);
        System.out.println(person);

        //Record class
        ArrayList<AddressRecord> adresler = new ArrayList<>();
        adresler.add(new AddressRecord("ABC Street", "London", AddressEnum.BUSINESS));
        adresler.add(new AddressRecord("XYZ Steet Record Apt", "London", AddressEnum.HOME));
        PersonRecord personRecord = new PersonRecord("Mehmet", "Ali"
                , "123456868",
                adresler);
        System.out.println(personRecord);
        System.out.println();

        person.printAddress();
        System.out.println();

        personRecord.printAddress();

        //Getters methods of Record class. Methods names are same with the properties names.
        System.out.println(personRecord.firstName());
        System.out.println(personRecord.lastName());
        System.out.println(personRecord.phone());

    }
}
