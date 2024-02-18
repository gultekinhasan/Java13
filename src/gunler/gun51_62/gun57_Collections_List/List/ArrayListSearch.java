package gunler.gun51_62.gun57_Collections_List.List;

import java.util.ArrayList;

public class ArrayListSearch {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Ankara");
        cities.add("Kayseri");
        cities.add("Çanakkale");
        cities.add("Çankırı");
        cities.add("Çanakkale");
        cities.add("İstanbul");
        cities.add("Çanakkale");

        String search = "";
        search = "Çanakkale";

        System.out.println("Şehirler ArrayListinde searching : " + search);
        if (cities.contains(search)) {
            System.out.println(search + " şehri listede var.");
            System.out.println("index no(first) : " + cities.indexOf(search));
            System.out.println("index no(last)  : " + cities.lastIndexOf(search));
        } else System.out.println(search + " şehri listede yok!!!");
        System.out.println();

        int index = 0;
        for (String sehir : cities) {
            if (sehir.equals("Çanakkale")) {
                System.out.println("İndex no :" + index);
            }
            index++;
        }
        String sonuc = myIndexOf(cities, "Çankırı");
        System.out.println(sonuc);
    }

    //Kendi indexof metodumuz
    public static String myIndexOf(ArrayList<String> liste, String sehir) {
        String result = "";
        int index = 0;
        for (String eleman : liste) {
            if (eleman.equals(sehir)) {
                result += index + " ";
            }
            index++;
        }
        if (result.isBlank()) result = sehir + " listede yok!!!";
        return result;
    }
}
