package gunler.gun41_50.gun42_StaticClassMembers_1;

public class Dinner {

   static int pizzaSlice =8;

    public void takeSlice(){
        pizzaSlice--;
    }
    public void takeSlice(int slice){
        pizzaSlice -= slice;
    }
}
