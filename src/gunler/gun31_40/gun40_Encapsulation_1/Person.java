package gunler.gun31_40.gun40_Encapsulation_1;
import java.util.ArrayList;

public class Person {
    private String name;
    private int age;

    private Adres evAdresi; //instance of Adres class--- Person(class) has Adres(class)
    private Adres isAdresi; //instance of Adres class--- Person(class) has Adres(class)
    private Adres okulAdresi; //instance of Adres class--- Person(class) has Adres(class)

    private ArrayList<Adres> adresler = new ArrayList<>(); //List of Adres class instances--- Person has adresler
    // Adres[] adreslerArr = new Adres[5];

    private int counter; //Eklenen adres sayısını kontrol etmek için
    private final int MAX_ADRES_SAYISI = 5; //adresler ArrayList'inin alabileceği Maximum addres sayısı

    public Person() {
    }

    public Person(String name, int age, Adres evAdresi, Adres isAdresi, Adres okulAdresi, ArrayList<Adres> adresler) {
        // this.name = name;
        setName(name);
        //this.age = age;
        setAge(age);
        // this.evAdresi = evAdresi;
        setEvAdresi(evAdresi);
        //this.isAdresi = isAdresi;
        setIsAdresi(isAdresi);
        // this.okulAdresi = okulAdresi;
        setOkulAdresi(okulAdresi);
        // this.adresler = adresler;
        setAdresler(adresler);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) { // "   Ahmet         "
        name = name.trim();

        if (name.length() >= 3 && name.length() < 30) {
            this.name = name;
        } else {
            System.out.println("Kurallara uygun olmayan veri girildi!!!");
            this.name = "isimsiz";
        }
    }

    public int getAge() {
        return age;
    }

    public boolean setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
            return true;
        }
        return false;
    }

    public Adres getEvAdresi() {
        return evAdresi;
    }

    public void setEvAdresi(Adres evAdresi) {
        this.evAdresi = evAdresi;
    }

    public Adres getIsAdresi() {
        return isAdresi;
    }

    public void setIsAdresi(Adres isAdresi) {
        this.isAdresi = isAdresi;
    }

    public Adres getOkulAdresi() {
        return okulAdresi;
    }

    public void setOkulAdresi(Adres okulAdresi) {
        this.okulAdresi = okulAdresi;
    }

    public ArrayList<Adres> getAdresler() {
        return adresler;
    }

    //Gözden geçirilecek--Homework
    public void setAdresler(ArrayList<Adres> adresler) {
       /* for (int i = 0; i < 10; i++) {
            for (Adres adres : adresler){
                this.adresler.add(adres);
            }
        }*/
        if (adresler.size() <= MAX_ADRES_SAYISI) {
            this.adresler = adresler;
        } else {
            for (int i = this.adresler.size(); i < MAX_ADRES_SAYISI; i++) { //Parametre olarak gelen ArrayList eleman sayısı MAX_ADRES_SAYISI'dan büyükse max sayı kadar olan adresleri assign et
                this.adresler.add(adresler.get(i));
            }
        }
    }

    public void addAddress(Adres adres) {
        if (counter <= MAX_ADRES_SAYISI) {
            this.adresler.add(adres);
        }
        counter++; //Eklenen adres sayısını kontrol etmek için
    }

}
