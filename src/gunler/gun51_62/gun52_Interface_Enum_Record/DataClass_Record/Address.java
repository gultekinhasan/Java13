package gunler.gun51_62.gun52_Interface_Enum_Record.DataClass_Record;

public final class Address {
    private final String street;
    private final String city;
    private AddressEnum type;

    public Address(String street, String city, AddressEnum type) {
        this.street = street;
        this.city = city;
        this.type = type;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", type=" + type +
                '}';
    }
}
