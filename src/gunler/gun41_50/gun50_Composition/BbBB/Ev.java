package gunler.gun41_50.gun50_Composition.BbBB;

public class Ev {
    private String isim;
    private Oda oda1;
    private Oda oda2;
    private Oda oda3;
    private Oda oda4;
    private Cati cati;
    private Mutfak mutfak;
    private Bahce bahce;

    public Ev(String isim, Oda oda1,Oda oda2,Oda oda3,Oda oda4, Cati cati, Mutfak mutfak, Bahce bahce) {
        this.isim = isim;
        this.oda1 = oda1;
        this.oda2 = oda2;
        this.oda3 = oda3;
        this.oda4 = oda4;
        this.cati = cati;
        this.mutfak = mutfak;
        this.bahce = bahce;
    }

    public Oda getOda2() {
        return oda2;
    }

    public Oda getOda3() {
        return oda3;
    }

    public Oda getOda4() {
        return oda4;
    }

    public String getIsim() {
        return isim;
    }

    public Oda getOda1() {
        return oda1;
    }

    public Cati getCati() {
        return cati;
    }

    public Mutfak getMutfak() {
        return mutfak;
    }

    public Bahce getBahce() {
        return bahce;
    }

    public void kapiAc(){
        System.out.println(" kapisi acildi");
    }
}
