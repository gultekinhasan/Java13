package gunler.gun41_50.gun50_Composition.Computer;

public class Monitor {
    private String model;
    private String ureticiFirma;
    private int ekranBoyutu;
    private Cozunurluk cozunurluk;

    public Monitor(String model, String ureticiFirma, int ekranBoyutu, Cozunurluk cozunurluk) {
        this.model = model;
        this.ureticiFirma = ureticiFirma;
        this.ekranBoyutu = ekranBoyutu;
        this.cozunurluk = cozunurluk;
    }

    public void ekranAyarla(){
        System.out.println("Ekran parlaklık ayarları degistirildi.");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUreticiFirma() {
        return ureticiFirma;
    }

    public void setUreticiFirma(String ureticiFirma) {
        this.ureticiFirma = ureticiFirma;
    }

    public int getEkranBoyutu() {
        return ekranBoyutu;
    }

    public void setEkranBoyutu(int ekranBoyutu) {
        this.ekranBoyutu = ekranBoyutu;
    }

    public Cozunurluk getCozunurluk() {
        return cozunurluk;
    }

    public void setCozunurluk(Cozunurluk cozunurluk) {
        this.cozunurluk = cozunurluk;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "model='" + model + '\'' +
                ", ureticiFirma='" + ureticiFirma + '\'' +
                ", ekranBoyutu=" + ekranBoyutu +
                ", cozunurluk=" + cozunurluk +
                '}';
    }
}
