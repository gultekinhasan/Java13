package gunler.gun31_40.gun38_Constructors_PassingObjects_2.Okul;

public class Adres {
    String cadde;
    String sehir;
    String ilce;
    int no;

    //Overloaded constructors--creating constructors with same name but different params
    public Adres() {
        cadde = "belirtilmemiş";
        sehir = "belirtilmemiş";
        ilce = "belirtilmemiş";
        no = 0;
    }

    public Adres(String sehir) {
     /*
        cadde = "belirtilmemiş";
        ilce = "belirtilmemiş";
        no = 0;
        */
        this(); //Constructor chaining--> calling a constructor from another constructor
        this.sehir = sehir;
    }

    public Adres(String sehir, String ilce) {
        this(sehir); //Constructor chaining--> calling a constructor from another constructor
        this.ilce = ilce;
    }
    //////////////////////////////////////////////////////////

    public Adres( String sehir, String ilce,String cadde, int no) {
        this.cadde = cadde;
        this.sehir = sehir;
        this.ilce = ilce;
        this.no = no;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "cadde='" + cadde + '\'' +
                ", sehir='" + sehir + '\'' +
                ", ilce='" + ilce + '\'' +
                ", no=" + no +
                '}';
    }
}
