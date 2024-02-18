package gunler.gun31_40.gun35_Review.Kutuphane;

public class KutuphaneProg {
    public static void main(String[] args) {
        Kutuphane kutuphane = new Kutuphane();
        kutuphane.name = "Halk kütüphanesi";
        kutuphane.address = "Cumhuriyet Caddesi no=1923";
        // kutuphane.books[0] = new Kitap();

        Kitap kitap1 = new Kitap();
        kitap1.name = "Sefiller";
        kitap1.type = "Roman";
        kitap1.publishDate = 2022;
        kitap1.publisher = "ABC Yayıncılık";
        kitap1.authors[0] = new Yazar("Victor Hugo");
        kitap1.authors[1] = new Yazar("Anonim");


        Kitap kitap2 = new Kitap();
        kitap2.name = "Harry Potter";
        kitap2.type = "Roman";
        kitap2.publishDate = 2008;
        kitap2.publisher = "SAM Yayıncılık";
        kitap2.authors[0] = new Yazar("Adam Smith");

        kutuphane.books[0] = kitap1;
        kutuphane.books[1] = kitap2;

        //     kutuphane.printInfo();

        // kutuphane.findBookByName("Potter");
        kutuphane.findBookByType("Roman");
    }
}
