package gunler.gun41_50.gun41_Encapsulation_2;
import java.util.ArrayList;

public class ReadOnlyClass {
    //Instance variables belong to Object
    private int plaka;
    private String ilAdi;

    //Static members belong to Class
    private static   ArrayList<String> iller = new ArrayList<>();

    public ReadOnlyClass(int plaka, String ilAdi) {
        //      this.iller = new ArrayList<>();
       /* this.plaka = plaka;
        this.ilAdi = ilAdi;*/
        setPlaka(plaka);
        setIlAdi(ilAdi);
        setIl();
    }

    private void setPlaka(int plaka) {
        if (plaka > 0 && plaka <= 100) {
            this.plaka = plaka;
        }
    }

    private void setIlAdi(String ilAdi) {
        this.ilAdi = ilAdi.toUpperCase();
    }

    private void setIl() {
        String str = plaka + "-" + ilAdi;
        iller.add(str);
    }

    public int getPlaka() {
        return plaka;
    }

    public String getIlAdi() {
        return ilAdi;
    }

    public ArrayList<String> getIller() {
        System.out.println("System.identityHashCode(iller) = " + System.identityHashCode(iller));
        return iller;
    }

    public ArrayList<String> getIllerV1() {
        System.out.println("System.identityHashCode(iller) = " + System.identityHashCode(iller));
        return new ArrayList<>(iller);
    }
}
