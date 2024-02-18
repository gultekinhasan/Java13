package gunler.gun1_10.gun04.gun04_variables;
/*
          Gidilen mesefe hesaplama algoritması.
          1-Hız Değerini oku
          2-Zaman Değerini oku
          3-Zaman ve Hız'ı çarp (Mesafe=Hız*Zaman)
          4-Mesafeyi ekrana yaz
 */

public class MesafeHesaplama {
    public static void main(String[] args) {
        short speedKm;
        byte timeHr;
        int distanceKm;

        speedKm = 70;
        timeHr = 5;

        distanceKm = speedKm * timeHr;

        System.out.println("Arabanın Hızı(km)    : " + speedKm +"KM");
        System.out.println("Gidilen Süre(saat)   : " + timeHr +"SAAT");
        System.out.println("Toplam Gidilen Messafe(km)   : " + distanceKm + "KM");
        System.out.println();

        speedKm = 120;
        timeHr = 7;
        distanceKm = speedKm * timeHr;

        System.out.println("Arabanın Hızı(km)    : " + speedKm + "KM");
        System.out.println("Gidilen Süre(saat)   : " + timeHr + "SAAT");
        System.out.println("Toplam Gidilen Messafe(km)   : " + distanceKm + "KM");
        System.out.println();

        speedKm = 100;
        timeHr = 3;
        distanceKm = speedKm * timeHr;

        System.out.println("Arabanın Hızı(km)    : " + speedKm + "KM");
        System.out.println("Gidilen Süre(saat)   : " + timeHr + "SAAT");
        System.out.println("Toplam Gidilen Messafe(km)   : " + distanceKm + "KM");
        System.out.println();




    }
}
