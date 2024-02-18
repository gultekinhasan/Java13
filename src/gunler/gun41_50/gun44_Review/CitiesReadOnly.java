package gunler.gun41_50.gun44_Review;

import java.util.ArrayList;

public class CitiesReadOnly {

    static private ArrayList<City> cities;
    // STATIC BLOCK
    // Database connection and retrieving data from database
    // File reading and assigning data to relevant properties of Class
    // More complex operations than Constructor
    // Setting Default/Initials values of Class

    static {
        cities = new ArrayList<>();
        cities.add(new City(1,"Adana"));
        cities.add(new City(2,"Adiyaman"));
        cities.add(new City(5,"Amasya"));
        cities.add(new City(6,"Ankara"));
        cities.add(new City(20,"Denizli"));
        cities.add(new City(34,"Istanbul"));
        cities.add(new City(71,"Kirikkale"));
    }

    public static ArrayList<City>getCities(){
        // return cities; //Returns original cities ArrayList-- this usage is not recommended for security reason
        return new ArrayList<>(cities);//This usage is recommended Returns copy of original  ArrayList of cities not the original
    }

    public static City findByPlateNumber(int plateNumber){
        for (City city: getCities()){
            if (plateNumber == city.getCityPlateNumber()){
                return city;
            }
        }
        return new City(0,"City cannot Found");
    }

}
