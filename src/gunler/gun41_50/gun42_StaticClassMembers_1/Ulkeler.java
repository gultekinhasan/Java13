package gunler.gun41_50.gun42_StaticClassMembers_1;

public class Ulkeler {
    static int ulkelerSayac;
    int dummySayac;
    String name;
    String ulkeKod;
    int intTelKod;

    public Ulkeler (String name, String ulkeKod, int intTelKod){
        ulkelerSayac++;
        dummySayac++;
        this.name=name;
        this.ulkeKod=ulkeKod;
        this.intTelKod=intTelKod;
    }

    @Override
    public String toString() {
        return "Ulkeler{" +
                "dummySayac=" + dummySayac +
                ", name='" + name + '\'' +
                ", ulkeKod='" + ulkeKod + '\'' +
                ", intTelKod=" + intTelKod +
                '}';
    }
}
