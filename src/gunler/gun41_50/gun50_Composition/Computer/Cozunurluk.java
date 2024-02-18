package gunler.gun41_50.gun50_Composition.Computer;

public class Cozunurluk {
    private int boy;
    private int en;
    private int pixelSayisi;

    public Cozunurluk(int boy, int en, int pixelSayisi) {
        this.boy = boy;
        this.en = en;
        this.pixelSayisi = pixelSayisi;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public int getPixelSayisi() {
        return pixelSayisi;
    }

    public void setPixelSayisi(int pixelSayisi) {
        this.pixelSayisi = pixelSayisi;
    }

    @Override
    public String toString() {
        return "Cozunurluk{" +
                "boy=" + boy +
                ", en=" + en +
                ", pixelSayisi=" + pixelSayisi +
                '}';
    }
}
