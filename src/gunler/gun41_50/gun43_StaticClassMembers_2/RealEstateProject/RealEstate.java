package gunler.gun41_50.gun43_StaticClassMembers_2.RealEstateProject;

import java.util.ArrayList;

public class RealEstate {

    ArrayList<House> availableHouse;

    static {
        System.out.println("RealEstate Project is Started...");
    }

    {
        availableHouse = new ArrayList<>();
    }

    public void addHouse(House house){
        availableHouse.add(house);
    }
    public void displayAvailableHouses(){
        System.out.println("Available House List");
        System.out.println("--------------------");
        for (House house: availableHouse){
            System.out.println("house.getHouseId()    = " + house.getHouseId());
            System.out.println("house.getAddress()    = " + house.getAddress());
            System.out.println("house.getNumRooms()   = " + house.getNumRooms());
            System.out.println("house.getRentAmount() =" + house.getRentAmount());
            System.out.println("--------------------");

        }
    }
}
