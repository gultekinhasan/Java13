package gunler.gun41_50.gun44_Review.Galeri;

import java.util.ArrayList;
import gunler.gun41_50.gun44_Review.City;
import gunler.gun41_50.gun44_Review.CitiesReadOnly;
import gunler.gun41_50.gun44_Review.CitiesReadOnlyTest;

public class Galeri {
    private static String name;
    static private String address;

    private static ArrayList<Araba> arabalar;
    private static ArrayList<Araba> silinenArabalar;

    // Database connection and retrieve data from database
    // File reading and assigning data to relevant properties of Class
    // More complex operations than Constructor

    static {
        name = "ABC Modern Araba Galerisi";

        City sehir = CitiesReadOnly.findByPlateNumber(71);
        address = "Oto Sanayi Galericiler Cad. No:2023" + sehir.getCityName();

        arabalar = new ArrayList<>();
        silinenArabalar = new ArrayList<>();

        //ArrayList add method ile ekleme
        Araba araba = new Araba("Honda","Accord","QYEYUE-23414","HH-5623456-QWE");
        arabalar.add(araba);

        arabalar.add(new Araba("Toyota","Yaris","TYT-215376","05 ABC 12345"));
        arabalar.add(new Araba("Mercedes","E200","HG-1999","06 HG 0040"));
        arabalar.add(new Araba("Ford","S-Max","TR-00001","41 TC 12345"));

        //Method ile ekleme
        addAraba(new Araba("VW","Passat","KKKWWW-5555","XXX-1290-4"));
        addAraba(new Araba("Nissan","Primera","GGHJJ-767678","77BL-340-4"));


    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Galeri.name = name;
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        Galeri.address = address;
    }

    public static ArrayList<Araba> getArabalar() {
        return arabalar;
    }
    public static int getArabalarSayisi (){
        return arabalar.size();
    }

    public static void setArabalar(ArrayList<Araba> arabalar) {
        Galeri.arabalar = arabalar;
    }

    public static void addAraba (Araba araba){
        Galeri.arabalar.add(araba);
        System.out.println(araba.getName() + "-" + araba.getModel() + " marka-model araba Galeriye eklendi.");
    }
    public static ArrayList<Araba> getSilinenArabalar() {
        return silinenArabalar;
    }

    public static void showAraba (){
        System.out.println(name);
        System.out.println(address);
        System.out.println("--------------");

        for (Araba araba : getArabalar()){
            System.out.println(araba);
        }
        System.out.println("--------------------------------------------");
        System.out.println("Toplam " + arabalar.size() + " adet araba var.");
    }

    public static void showArabalarV1(){ //Formatted String ile kullanım
        System.out.println(name);
        System.out.println(address);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Galerimizdeki arabaların listesi.");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Galeride Toplam " + arabalar.size() + " adet araba var.");

        int srNo = 1;
        System.out.printf("%-3s %-15s %-23s %-15s%n","Sr","Araç Markası","Plaka","VIN Numarası");
        System.out.printf("%-3s %-15s %-23s %-15s%n","-".repeat(3),"-".repeat(15),"-".repeat(22),"-".repeat(30));
        for(Araba araba :arabalar){
            // System.out.println(srNo + "- " + araba);
            System.out.printf("%2d- %s%n",srNo,araba.toStringFormatted()); // %d--> Integer Number, %s String, %n new Line, %S Uppercase String
            srNo++;
        }
    }

    public static void showArabalarSilinen(){
        System.out.println(name);
        System.out.println(address);
        System.out.println("--------------------------------------------");
        System.out.println("Silinen arabaların listesi");
        System.out.println("--------------------------------------------");
        for(Araba araba : getSilinenArabalar()){
            System.out.println(araba);
        }
        System.out.println("--------------------------------------------");
        System.out.println("Toplam " + silinenArabalar.size() + " adet araba var.");
    }


    public static void listArabalarByName(String name){
        System.out.println(name.toUpperCase() + " Marka arabaların listesi");
        System.out.println("------------------------------------------");
        int sayac = 0; //Listelenen arabaların sayısı
        int srNo = 1;
        for (Araba araba:arabalar){
            if(araba.getName().equalsIgnoreCase(name)){
                System.out.println(srNo + "- " + araba);
                sayac++;
                srNo++;
            }
        }
        if(sayac == 0){
            System.out.println("Galeride " + name + " isimli araba yok.");
        }else System.out.println(name + " isimli arabadan toplam : " + sayac + " adet var.");
    }

    public static void silArabaPlaka(String plaka){
        int sayac = 0;
        for (Araba araba : arabalar){
            if(araba.getPlaka().equalsIgnoreCase(plaka)){
                System.out.println(plaka + " plakalı araç bilgileri aşağıdadır.");
                System.out.println(araba);
                silinenArabalar.add(araba);
                arabalar.remove(araba);
                System.out.println(plaka + " plakalı araç galeriden silindi.");
                sayac++;
                break;
            }
        }
        if(sayac == 0){
            System.out.println(plaka + " plakalı araç bulunamadı!!!");
        }
    }
}
