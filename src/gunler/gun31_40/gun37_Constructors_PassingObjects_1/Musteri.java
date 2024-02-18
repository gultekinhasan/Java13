package gunler.gun31_40.gun37_Constructors_PassingObjects_1;

public class Musteri {
    String name;
    int hesapNo;
    String phone;
    double bakiye;

    public Musteri() {
    }

    public Musteri(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public double getBakiye(){
        return this.bakiye;
    }

    public void showInfo(){
        System.out.println("***   Müşteri Bilgiler   ***");
        System.out.println("Müşterinin adı      : " + name);
        System.out.println("Müşterinin telefonu : " + phone);
        System.out.println("Müşterinin hesap no : " + hesapNo);
        System.out.println("Müşterinin bakiyesi : " + bakiye);
    }
}
