package gunler.gun51_62.gun54_Polymorphism_2;

public class Sekil {
    public void ciz(){
        System.out.println("sekil ciziliyor");
    }
    public void sekilOlustur(){
        System.out.println("Sekil olusturuluyor");
    }
}
class Kare extends Sekil{
    public void ciz(){
        System.out.println("kare ciziliyor");
    }
}
class Ucgen extends Sekil{
    public void ciz(){
        System.out.println("ucgen ciziliyor");
    }
}
class Daire extends Sekil{
    public void ciz(){
        System.out.println("daire ciziliyor");
    }
}

class SekilTest{
    public static void main(String[] args) {

        // Parent Class obj
        Sekil sekil = new Sekil();
        sekil.ciz(); // parent class method
        sekil.sekilOlustur();

        Kare kare = new Kare();
        kare.ciz(); // child class method
        kare.sekilOlustur();

        System.out.println("///////////");

        Sekil sekil2 = new Kare();
        sekil2.ciz(); // child class method
        sekil2.sekilOlustur(); // parent class method

        Sekil sekil3 = new Ucgen();
        sekil3.ciz(); // child class method
        sekil3.sekilOlustur(); // parent class method

        Sekil sekil4 = new Daire();
        sekil4.ciz(); // child class method
        sekil4.sekilOlustur(); // parent class method

    }
}