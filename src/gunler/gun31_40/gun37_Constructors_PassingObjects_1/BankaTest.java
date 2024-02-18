package gunler.gun31_40.gun37_Constructors_PassingObjects_1;

public class BankaTest {
    public static void main(String[] args) {
        Banka banka1 = new Banka();
        System.out.println("banka1.name = " + banka1.name);
        System.out.println("banka1.name.length() = " + banka1.name.length());
        System.out.println("banka1.name.toUpperCase() = " + banka1.name.toUpperCase());

        banka1.name = "ABC Bankası";
        System.out.println("banka1.name = " + banka1.name);
        System.out.println("banka1.name.toUpperCase() = " + banka1.name.toUpperCase());

        banka1.address = "Finans Caddesi No = 100";
        banka1.hesapNo = 1234;
        System.out.println();

        Banka banka2 = new Banka("XYZ Katılım Bankası", "XYZ Bulvarı no:123", 5000);

        System.out.println("banka2.name = " + banka2.name);
        System.out.println("banka2.address = " + banka2.address);
        System.out.println("banka2.hesapNo = " + banka2.hesapNo);

        System.out.println("banka1.musteriler.size() = " + banka1.musteriler.size());

        Musteri musteri = new Musteri("Ahmet Falanca", "90-316 567 8900");
        Musteri musteri1 = new Musteri("Fatma Gül", "90-212 345 7655");
        Musteri musteri2 = new Musteri("Fatma Canon", "1-216 567 7655");
        Musteri musteri3 = new Musteri("Fatih Noname", "1-217 543 5678");

        banka2.musteriEkle(musteri); //Passing object to method
        banka2.musteriEkle(musteri1);
        banka2.musteriEkle(musteri2);
        banka2.musteriEkle(musteri3);

        banka2.paraYatir(musteri, 100);
        banka2.paraYatir(musteri, 345);
        banka2.paraYatir(musteri1, 1575);
        banka2.musteriListe();

        banka2.paraCek(musteri, 100);
        banka2.musteriListe();

        banka2.findByHesapNo(5011);
        banka2.finfByName("Fatm");
    }
}
