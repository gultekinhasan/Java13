package gunler.gun51_62.gun51_AbstactClass.Cake;

public abstract class BaseKek {
    private int un;
    private int seker;
    private int yumurta;
    private int sut;
    private int kabartmaTozu;
    private int yag;

    private boolean isMixed; //Kek pişirilmeden önce karıştırılmış mı?

    public BaseKek(int un, int seker, int yumurta, int sut, int kabartmaTozu, int yag) {
        this.un = un;
        this.seker = seker;
        this.yumurta = yumurta;
        this.sut = sut;
        this.kabartmaTozu = kabartmaTozu;
        this.yag = yag;
        this.isMixed = false;
    }

    public boolean isMixed() {
        return isMixed;
    }

    public void setMixed(boolean mixed) {
        isMixed = mixed;
    }

    public int getUn() {
        return un;
    }

    public void setUn(int un) {
        this.un = un;
    }

    public int getSeker() {
        return seker;
    }

    public void setSeker(int seker) {
        this.seker = seker;
    }

    public int getYumurta() {
        return yumurta;
    }

    public void setYumurta(int yumurta) {
        this.yumurta = yumurta;
    }

    public int getSut() {
        return sut;
    }

    public void setSut(int sut) {
        this.sut = sut;
    }

    public int getKabartmaTozu() {
        return kabartmaTozu;
    }

    public void setKabartmaTozu(int kabartmaTozu) {
        this.kabartmaTozu = kabartmaTozu;
    }

    public int getYag() {
        return yag;
    }

    public void setYag(int yag) {
        this.yag = yag;
    }

    @Override
    public String toString() {
        return "BaseKek{" +
                "un=" + un +
                ", seker=" + seker +
                ", yumurta=" + yumurta +
                ", sut=" + sut +
                ", kabartmaTozu=" + kabartmaTozu +
                ", yag=" + yag +
                '}';
    }

    public abstract void karistir();
    public abstract void pisir();
}
