package gunler.gun41_50.gun50_Composition.BbBB;

public class Oda {
    private String neOdasi;
    private String renk;

    public Oda(String neOdasi, String renk) {
        this.neOdasi = neOdasi;
        this.renk = renk;
    }

    public String getNeOdasi() {
        return neOdasi;
    }

    public String getRenk() {
        return renk;
    }

    @Override
    public String toString() {
        return "Oda{" +
                "neOdasi='" + neOdasi + '\'' +
                ", renk='" + renk + '\'' +
                '}';
    }
}
