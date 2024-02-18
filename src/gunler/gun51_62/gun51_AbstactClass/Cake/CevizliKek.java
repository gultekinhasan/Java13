package gunler.gun51_62.gun51_AbstactClass.Cake;

public class CevizliKek extends BaseKek {
    private int ceviz;

    public CevizliKek(int un, int seker, int yumurta, int sut, int kabartmaTozu, int yag) {
        super(un, seker, yumurta, sut, kabartmaTozu, yag);
    }

    @Override
    public void karistir() {
        System.out.println("Aşağıdaki malzemeleri kariştirma kabına koy.");
        System.out.println("En az 5 dakika karıştır.");
        System.out.println("Un           : " + getUn());
        System.out.println("Şeker        : " + getSeker());
        System.out.println("Yağ          : " + getYag());
        System.out.println("Yumurta      : " + getYumurta());
        System.out.println("Süt          : " + getSut());
        System.out.println("Kabarma tozu : " + getKabartmaTozu());

        System.out.println("İyice karıştırdıktan sonra ceviz ekle : " + getCeviz());
        System.out.println("Bütün malzemeler karıştırıldı.");
        setMixed(true);
    }

    @Override
    public void pisir() {

    }

    public int getCeviz() {
        return ceviz;
    }

    public void setCeviz(int ceviz) {
        this.ceviz = ceviz;
    }
}