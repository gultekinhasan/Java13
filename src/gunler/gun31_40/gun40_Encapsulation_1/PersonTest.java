package gunler.gun31_40.gun40_Encapsulation_1;
import java.util.ArrayList;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();

        person1.setName("Al");
        System.out.println("person1.getName() = " + person1.getName());

        person1.setEvAdresi(new Adres("Abc caddesi no : 1234","Adana","Türkiye"));
        System.out.println("person1.getEvAdresi() = " + person1.getEvAdresi());

        Adres isAdresi = new Adres("ABC Plaza no : 2345","Adana","Türkiye");
        person1.setIsAdresi(isAdresi);
        System.out.println("person1.getIsAdresi() = " + person1.getIsAdresi());


        ArrayList<Adres> adresler = new ArrayList<>();
        adresler.add(new Adres("1-ABC Plaza no : 2345","Adana","Türkiye"));
        adresler.add(new Adres("2-ABC Plaza no : 2345","Adana","Türkiye"));

        person1.setAdresler(adresler);

        ArrayList<Adres> adresler1 = new ArrayList<>();
        adresler1.add(new Adres("3-ABC Plaza no : 2345","Adana","Türkiye"));
        adresler1.add(new Adres("4-ABC Plaza no : 2345","Adana","Türkiye"));
        adresler1.add(new Adres("5-ABC Plaza no : 2345","Adana","Türkiye"));
        adresler1.add(new Adres("6-ABC Plaza no : 2345","Adana","Türkiye"));
        adresler1.add(new Adres("7-ABC Plaza no : 2345","Adana","Türkiye"));
        adresler1.add(new Adres("8-ABC Plaza no : 2345","Adana","Türkiye"));

        person1.setAdresler(adresler1);
        System.out.println("person1.getAdresler() = " + person1.getAdresler());
    }
}
