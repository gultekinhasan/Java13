package gunler.gun41_50.gun44_Review;

public class CitiesReadOnlyTest {
    public static void main(String[] args) {

        System.out.println(("Toplam " + CitiesReadOnly.getCities().size() + " adet sehir var."));

        for (City sehir : CitiesReadOnly.getCities()){
            System.out.println(sehir.getFullCityName());
        }

//        City sehir =new City();
//        sehir.setCityName("Konya");
//
//        City sehir1 =new City();
//        sehir.setCityName("Kayseri");
//
//        System.out.println(sehir);
//        System.out.println(sehir1);

        City sehir;
        sehir = CitiesReadOnly.findByPlateNumber(6);
        System.out.println(sehir);


    }
}
