package gunler.gun41_50.gun50_Composition.Computer;

public class BilgisayarTest {
    public static void main(String[] args) {
        Boyut boyut = new Boyut(40.8,15.7,25.3);
        Kasa kasa = new Kasa("Nirvana","Dell","Elektrik",boyut);
        Monitor monitor = new Monitor("Curved55","LG",25,new Cozunurluk(1920,1084,2568));
        Anakart anakart = new Anakart("A454","Intel",8,"v5.3",4);

        Bilgisayar bilgisayar = new Bilgisayar(anakart, monitor, kasa);
        bilgisayar.getKasa().calistir();
        System.out.println(bilgisayar.getMonitor().getEkranBoyutu());
        bilgisayar.getAnakart().programYukle("Word");
        System.out.println(bilgisayar.getMonitor().getCozunurluk().getPixelSayisi());
    }
}
