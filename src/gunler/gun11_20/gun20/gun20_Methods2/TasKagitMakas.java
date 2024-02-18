package gunler.gun11_20.gun20.gun20_Methods2;

public class TasKagitMakas {

    public static void main(String[] args) {

        // Tas-Kagit-Makas oyununu simule eden ve kazanani belirleyen bir method yaziniz

        String Sonuc;

        Sonuc = tasKagitMakas("Tas","Kagit");
        System.out.println("Sonuc = " + Sonuc);

        Sonuc = tasKagitMakas("Tas","Tas");
        System.out.println("Sonuc = " + Sonuc);

        Sonuc = tasKagitMakas("Tas","Makas");
        System.out.println("Sonuc = " + Sonuc);

        Sonuc = tasKagitMakas("Kagit","Makas");
        System.out.println("Sonuc = " + Sonuc);


    }

    public static String tasKagitMakas(String deger1, String deger2){

        if(deger1 == deger2){
            return "Berabere";
        }else if(deger1 == "Tas" && deger2 == "Makas"){
            return "1. oyuncu kazanir";
        }else if(deger1 == "Makas" && deger2 == "Kagit"){
            return "1. oyuncu kazanir";
        }else if(deger1 == "Kagit" && deger2 == "Tas"){
            return "1. oyuncu kazanir";
        }else{
            return "2. oyuncu kazanir";
        }
    }

}
