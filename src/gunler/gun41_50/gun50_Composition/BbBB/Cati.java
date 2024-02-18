package gunler.gun41_50.gun50_Composition.BbBB;

public class Cati {
    private int yukselik;
    private String name;

    public Cati(int yukselik, String name) {
        this.yukselik = yukselik;
        this.name = name;
    }

    public int getYukselik() {
        return yukselik;
    }

    public String getName() {
        return name;
    }

    public void tut(){
        System.out.println("baca tutuyor...");
    }

    @Override
    public String toString() {
        return "Cati{" +
                "yukselik=" + yukselik +
                ", name='" + name + '\'' +
                '}';
    }
}
