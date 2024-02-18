package gunler.gun51_62.gun52_Interface_Enum_Record.DataClass_Record;
import java.util.ArrayList;

public record PersonRecord(String firstName,
                           String lastName,
                           String phone,
                           ArrayList<AddressRecord> addressRecords) implements Addressable{


    @Override
    public String toString() {
        return "PersonRecord{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", addressRecords=" + addressRecords +
                '}';
    }

    @Override
    public void printAddress() {
        System.out.println("Record class address");
        for (AddressRecord address : addressRecords()){
            System.out.println(address);
        }
    }
}
