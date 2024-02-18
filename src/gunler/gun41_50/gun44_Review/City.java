package gunler.gun41_50.gun44_Review;

public class City {
    // Data members
    private int cityPlateNumber;
    private String cityName;

    public City() {

    }

    City(int cityPlateNumber, String cityName){
       // this.cityPlateNumber=cityPlateNumber;
       // this.cityName=cityName;
        setCityName(cityName);
        setCityPlateNumber(cityPlateNumber);
    }



    // Setter And Getter Methods
    public int getCityPlateNumber() {
        return cityPlateNumber;
    }

    public void setCityPlateNumber(int cityPlateNumber) {
        if(cityPlateNumber > 0 && cityPlateNumber < 100){
            this.cityPlateNumber = cityPlateNumber;
        }
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName.trim().toUpperCase();
    }

    public String getFullCityName(){
        if (getCityName() != null){
            return getCityPlateNumber() + "-" +getCityName();
        }
        return "No City";
    }

    @Override
    public String toString() {
        return getFullCityName();
    }
}
