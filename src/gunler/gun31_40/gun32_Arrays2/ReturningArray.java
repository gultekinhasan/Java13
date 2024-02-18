package gunler.gun31_40.gun32_Arrays2;
public class ReturningArray {

    public static void main(String[] args) {

        String[] ulkeler = {"Almanya", "Ingiltere", "Turkie", "Suriye", "Yunanistan"};

        for (String ulke : reversArray(ulkeler)){
            System.out.println("ulke = " + ulke);
        }

        System.out.println("----------------");


        String[] arabalar = {"Toyota", "Opel", "Honda", "Volvo", "Mercedes"};

        String[] yeniArabalar = reversArray(arabalar);

        for(String araba : yeniArabalar){
            System.out.println("araba = " + araba);
        }

        System.out.println("----------------");

        String[] isimler = {"Joe", "Jahn", "Jane", "Jack", "George"};

        for (String isim : isimler){
            System.out.println("isim = " + isim);
        }

        System.out.println("----------------");

        for (String isim : reversArray(isimler)){
            System.out.println("isim = " + isim);
        }

        System.out.println("----------------");
        System.out.println("----------------");

        for (String ulke : upperCaseMethod(ulkeler)){
            System.out.println("ulke = " + ulke);
        }

        System.out.println("----------------");

        String[] yeniArabalar2 = upperCaseMethod(arabalar);

        for(String araba : yeniArabalar2){
            System.out.println("araba = " + araba);
        }

        System.out.println("----------------");

        for (String isim : upperCaseMethod(isimler)){
            System.out.println("isim = " + isim);
        }

    }
    public static String[] reversArray(String[] dizi){
        String[] yeniDizi = new String[dizi.length];
        int index = dizi.length-1;
        for(int i=0; i<yeniDizi.length; i++){
            yeniDizi[i] = dizi[index];
            index--;
        }
        return yeniDizi;
    }

    public static String[] upperCaseMethod(String[] dizi){
        String[] yeniDizi = new String[dizi.length];
        for(int i=0; i< dizi.length; i++){
            yeniDizi[i] = dizi[i].toUpperCase();
        }
        return yeniDizi;
    }
}