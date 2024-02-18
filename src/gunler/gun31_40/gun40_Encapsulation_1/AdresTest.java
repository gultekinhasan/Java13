package gunler.gun31_40.gun40_Encapsulation_1;

public class AdresTest {
    public static void main(String[] args) {
        Adres adres1 = new Adres("Atatürk caddesi no: 1930","İstanbul", "Türkiye");
        Adres adres2 = new Adres("Bosna HerseK Mah.","Konya","Türkiye");
        Adres adres3 = new Adres("","Konya","Türkiye");



        System.out.println("adres1 = " + adres1);
        System.out.println("adres2 = " + adres2);
        System.out.println("adres3 = " + adres3);

        //Testing for .trim()
        adres1.setStreet("  Mevlana bulvarı no : 42             ");
        System.out.println("adres1.getStreet() = " + adres1.getStreet());

        //
        adres2.setCountry("ingiltere             ");
        System.out.println("adres2.getCountry() = " + adres2.getCountry());
        //
      //  adres2.setPlaka(42);
        //System.out.println("adres2.getPlaka() = " + adres2.getPlaka());

        //Testing for blank
        adres1.setStreet("        ");
        System.out.println("adres1.getStreet() = " + adres1.getStreet());
    }
}
