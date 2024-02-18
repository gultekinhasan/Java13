package gunler.gun31_40.gun38_Constructors_PassingObjects_2.Okul;
import java.util.ArrayList;


public class Okul {
    String name;
    Adres okulAdres;
    ArrayList<Ogrenci> ogrenciler;

    //Overloaded constructors--creating constructors with same name but different params
    public Okul() {
        name = "belirtilmemiş";
        okulAdres = new Adres();
        ogrenciler = new ArrayList<>();
    }

    public Okul(String name) {
        this(); //Constructor chaining--> calling a constructor from another constructor
        this.name = name;
    }

    public Okul(String name, Adres okulAdres) {
        this(name);//Constructor chaining--> calling a constructor from another constructor
        this.okulAdres = okulAdres;
    }

    public Okul(String name, Adres okulAdres, ArrayList<Ogrenci> ogrenciler) {
        this.name = name;
        this.okulAdres = okulAdres;
        this.ogrenciler = ogrenciler;
    }
    /////////////////////////////////

    public void ogrenciEkle(Ogrenci ogrenci){
        ogrenciler.add(ogrenci);
    }

    @Override
    public String toString() {
        return "Okul{" +
                "name='" + name + '\'' +
                ", okulAdres=" + okulAdres +
                ", ogrenciler=" + ogrenciler +
                '}';
    }
}
