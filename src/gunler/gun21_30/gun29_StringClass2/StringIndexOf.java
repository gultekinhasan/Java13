package gunler.gun21_30.gun29_StringClass2;

public class StringIndexOf {
    public static void main(String[] args) {
        String myStr = "Hello planet earth, you are a great planet.";
        String searchStr = "planet";

        String aranacak = "ahzu kabz";
        String cumle = "isbu vekelet ile yetkilendirdigim avukat dosya kapsamında ahzu kabza yetkilidir. ahzu kabz yetkisi 1 sene ile sınırlıdır.";

        int indexOfSearch = 0;

        indexOfSearch = myStr.indexOf(searchStr);
        System.out.println("indexOfSearch = " + indexOfSearch);
        indexOfSearch = myStr.indexOf(searchStr,indexOfSearch + 1);
        System.out.println("indexOfSearch = " + indexOfSearch);

        indexOfSearch = myStr.indexOf("Ahmet");
        System.out.println("indexOfSearch = " + indexOfSearch);

        indexOfSearch = cumle.indexOf(aranacak,indexOfSearch);
        System.out.println("indexOfSearch = " + indexOfSearch);
        indexOfSearch = cumle.indexOf(aranacak,indexOfSearch+1);
        System.out.println("indexOfSearch = " + indexOfSearch);

        indexOfSearch = cumle.indexOf("dosya");
        System.out.println("indexOfSearch = " + indexOfSearch);
        indexOfSearch = cumle.indexOf("isbu");
        System.out.println("indexOfSearch = " + indexOfSearch);
        indexOfSearch = cumle.indexOf("av");
        System.out.println("indexOfSearch = " + indexOfSearch);

    }
}
