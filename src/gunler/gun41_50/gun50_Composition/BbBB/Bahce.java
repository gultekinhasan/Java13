package gunler.gun41_50.gun50_Composition.BbBB;

public class Bahce {
    private String zemin;
    private String cit;
    private String mangal;
    private boolean havuzVarMi ;

    public Bahce(String zemin, String cit, String mangal, boolean havuzVarMi) {
        this.zemin = zemin;
        this.cit = cit;
        this.mangal = mangal;
        this.havuzVarMi = havuzVarMi;
    }

    public String getZemin() {
        return zemin;
    }

    public String getCit() {
        return cit;
    }

    public String getMangal() {
        return mangal;
    }

    public boolean isHavuzVarMi() {
        return havuzVarMi;
    }
    public void sula(){
        System.out.println("Bahçe sulanıyor");
    }

    @Override
    public String toString() {
        return "Bahce{" +
                "zemin='" + zemin + '\'' +
                ", cit='" + cit + '\'' +
                ", mangal='" + mangal + '\'' +
                ", havuzVarMi=" + havuzVarMi +
                '}';
    }
}
