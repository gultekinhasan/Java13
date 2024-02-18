package gunler.gun41_50.gun43_StaticClassMembers_2.RealEstateProject;

public class HouseProject {
    public static void main(String[] args) {
        RealEstate realEstate = new RealEstate();
        House house1 = new House();
        House house2 = new House("123 London Road",3,1500);
        House house3 = new House("234 Finch Road",5,2300);
        House house4 = new House("12 Friar Street",3,1350);


        realEstate.addHouse(house1);
        realEstate.addHouse(house2);
        realEstate.addHouse(house3);
        realEstate.addHouse(house4);

        realEstate.displayAvailableHouses();
    }
}
