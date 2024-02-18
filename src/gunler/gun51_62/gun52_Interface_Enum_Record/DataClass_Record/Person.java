package gunler.gun51_62.gun52_Interface_Enum_Record.DataClass_Record;
import java.util.ArrayList;

public final class Person implements Addressable {
    //Data members
    private final String firstName;
    private final String lastName;
    private final String phone;
    private final ArrayList<Address> addresses;

    public Person(String firstName, String lastName, String phone, ArrayList<Address> addresses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.addresses = addresses;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", addresses=" + addresses +
                '}';
    }

    @Override
    public void printAddress() {
        System.out.println("Classic class address");
        for (Address address : addresses){
            System.out.println(address);
        }
    }
}
