package gunler.gun41_50.gun42_StaticClassMembers_1;

public class UlkelerTest {
    public static void main(String[] args) {


        System.out.println("Ulkeler.ulkelerSayac = " + Ulkeler.ulkelerSayac);

        Ulkeler ulke1 = new Ulkeler("Turkiye","TR",90);

        System.out.println("Ulkeler.ulkelerSayac = " + Ulkeler.ulkelerSayac);

        Ulkeler ulke2 = new Ulkeler("Almanya","D",49);
        Ulkeler ulke3 = new Ulkeler("Ingiltere","UK",44);
        Ulkeler ulke4 = new Ulkeler("Amerika","ABD",1);

        System.out.println("Ulkeler.ulkelerSayac = " + Ulkeler.ulkelerSayac);
        System.out.println("ulke1.dummySayac = " + ulke1.dummySayac);

        Ulkeler.ulkelerSayac =25;
        ulke1.dummySayac =50;

        System.out.println("Ulkeler.ulkelerSayac = " + Ulkeler.ulkelerSayac);
        System.out.println("ulke1.dummySayac = " + ulke1.dummySayac);

        Ulkeler ulke5 = new Ulkeler("Fransa","FR",5);

        System.out.println("Ulkeler.ulkelerSayac = " + Ulkeler.ulkelerSayac);
        System.out.println("ulke1.dummySayac = " + ulke1.dummySayac);
        System.out.println("ulke5.dummySayac = " + ulke5.dummySayac);










    }
}
