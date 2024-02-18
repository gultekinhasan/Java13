package gunler.gun51_62.gun52_Interface_Enum_Record.DataClass_Record;

public record AddressRecord(String street, String city, AddressEnum type) {
    @Override
    public String toString() {
        return "AddressRecord{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", type=" + type +
                '}';
    }
}
