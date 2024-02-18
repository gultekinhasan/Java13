package gunler.gun51_62.gun54_Polymorphism_2;
import java.util.ArrayList;
public class SekilGrup {

    public static void main(String[] args) {

        Sekil[] sekiller = new Sekil[3];
        sekiller[0] = new Kare();
        sekiller[1] = new Ucgen();
        sekiller[2] = new Daire();

        for(Sekil sekil : sekiller){
            System.out.println(sekil.getClass().getName()); // gunler.gun54_Polymorphism2.Kare
            sekil.ciz(); // Kare ciziliyor
        }

        System.out.println("//////////////////");

        ArrayList<Sekil> sekilList = new ArrayList<>();
        sekilList.add(new Kare());
        sekilList.add(new Ucgen());
        sekilList.add(new Daire());

        for(Sekil sekil : sekilList){
            System.out.println(sekil.getClass().getSimpleName()); // Kare
            sekil.sekilOlustur(); // Sekil olusturuluyor
        }

        System.out.println("//////////////////");

        for(Sekil sekil : sekilList){
            System.out.println(sekil.getClass().getSimpleName());
            if(sekil.getClass().getSimpleName().equals("Kare")){
                sekil.ciz();
            }
        }
    }
}