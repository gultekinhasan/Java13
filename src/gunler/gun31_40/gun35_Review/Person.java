package gunler.gun31_40.gun35_Review;

public class Person {
    //Data members
    String firstName;
    String lastName;
    //int phone;
    String phone;
    String address;

    //No args Constructor
    public Person(){

    }
    //Canonical- Bütün parametreleri alan constructor
    public Person(String firstName, String lastName,String phone, String address){
        this.firstName = firstName.trim();
        this.lastName = lastName.trim();
        this.phone = phone.trim();
        this.address = address.trim();
    }

    //Methods
    public void printInfo(){
        System.out.println("First name     : " + firstName);
        System.out.println("Last name      : " + lastName);
        System.out.println("Phone number   : " + phone);
        System.out.println("Address        : " + address);
    }
    public void printInfoTable(){
        System.out.println(firstName + " " + lastName + " " + phone + " " + address);
    }
}
