package gunler.gun41_50.gun43_StaticClassMembers_2.RealEstateProject;

public class House {
    private  int houseId;
    private String address;
    private int numRooms;
    private double rentAmount;
    private static int nextHouseId;

    static {
        nextHouseId = 1000;
    }

    {
        houseId =nextHouseId++;
        address= "Unknown";
        numRooms=1;
        rentAmount=1000;
    }

    public House (){

    }
    public House (String address,int numRooms,double rentAmount){
        this.address=address;
        this.numRooms=numRooms;
        this.rentAmount=rentAmount;
    }

    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    public static int getNextHouseId() {
        return nextHouseId;
    }

    public static void setNextHouseId(int nextHouseId) {
        House.nextHouseId = nextHouseId;
    }
}
