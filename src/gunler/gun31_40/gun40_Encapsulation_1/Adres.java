package gunler.gun31_40.gun40_Encapsulation_1;

public class Adres {
    private String street; // "Mevlana caddesi no : 1234"
    private String city; // "Konya"
    private String country; // "Türkiye"

   // private int plaka;

    public Adres(String street, String city, String country/* ,int plaka*/) {
        /*this.street = street;
        this.city = city;
        this.country = country;
        this.plaka=plaka;*/
        setStreet(street);
        setCity(city);
        setCountry(country);
        //setPlaka(plaka);
    }

   /* public int getPlaka(){
        return plaka;
    }
    public void setPlaka(int plaka){
        if(plaka<0 || plaka>43){
            plaka=0;
        }
        this.plaka=plaka;
    }*/

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        // street = street.trim();
        if (street.isBlank()) {
            street = "isimsiz";
        }
        this.street = street.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        //   city = city.trim();
        if (city.isBlank()) {
            city = "isimsiz";
        }
        this.city = city.trim();
    }

    public String getCountry() {
        return country.toUpperCase();
    }

    public void setCountry(String country) {
        if(country.isBlank()){
            country = "isimsiz";
        }
        this.country = country.trim();
    }

    @Override
    public String toString(){
       /* String str = "";
        str += "Cadde : " + getStreet() + " Şehir/Ülke : " + getCity() + "/" + getCountry();
        return str;*/

        return "Cadde : " + getStreet() + " Şehir/Ülke : " + getCity() + "/" + getCountry() /*+ " Plaka : " + plaka*/;
    }
}
