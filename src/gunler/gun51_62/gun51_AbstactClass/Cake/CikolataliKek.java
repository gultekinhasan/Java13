package gunler.gun51_62.gun51_AbstactClass.Cake;

public class CikolataliKek extends BaseKek {
    private int cikolata;

    public CikolataliKek(int un, int seker, int yumurta, int sut, int kabartmaTozu, int yag) {
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

        System.out.println("İyice karıştırdıktan sonra çikolata ekle : " + getCikolata());
        System.out.println("Bütün malzemeler karıştırıldı.");
        setMixed(true);
    }

    @Override
    public void pisir() {
        if(isMixed()){
            System.out.println("Kek karıştırma işlemini yaptığın için keki Pişirebilirsin");
        } else{
            System.out.println("Kek karıştırma işlemini YAPMADIĞIN İÇİN keki pişiremezsin!!!");
            System.out.println("Önce karıştırma işlemini yap!!!");
        }
    }

    public int getCikolata() {
        return cikolata;
    }

    public void setCikolata(int cikolata) {
        this.cikolata = cikolata;
    }
}