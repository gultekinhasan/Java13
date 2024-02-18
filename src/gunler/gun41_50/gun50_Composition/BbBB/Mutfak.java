package gunler.gun41_50.gun50_Composition.BbBB;

public class Mutfak {
    private String tarz;
    private double m2;
    private String dolap;
    private String zemin;

    public Mutfak(String tarz, double m2, String dolap, String zemin) {
        this.tarz = tarz;
        this.m2 = m2;
        this.dolap = dolap;
        this.zemin = zemin;
    }

    public String getTarz() {
        return tarz;
    }

    public double getM2() {
        return m2;
    }

    public String getDolap() {
        return dolap;
    }

    public String getZemin() {
        return zemin;
    }
    public void yemekYap(String yemekAdi){
        System.out.println(yemekAdi + " yemeği yapiliyor..");
    }

    @Override
    public String toString() {
        return "Mutfak{" +
                "tarz='" + tarz + '\'' +
                ", m2=" + m2 +
                ", dolap='" + dolap + '\'' +
                ", zemin='" + zemin + '\'' +
                '}';
    }
}
