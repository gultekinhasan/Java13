package gunler.gun11_20.gun11.gun11ControlFlowStatement2;

public class Seasons {
    public static void main(String[] args) {

        int month=2;
        String Season = "";
        if (month>=1 && month<=12){
            if(month>=3 && month<=5){
                Season = "Spring";
            } else if (month>=6 && month<=8) {
                Season = "Summer";
            }  else if (month>=9 && month<=11) {
                Season = "Fall";
            } else  {
                Season = "Winter";
            }
            System.out.println("Season = " + Season);

        }else{
            System.out.println("Invalid month.");
        }
    }
}

