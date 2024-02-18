package gunler.gun11_20.gun12.gun12_SwitchCase;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Switch case statement in Java.");

        int day = 70;
        String dayString = "";
        String dayType = "";

        switch (day){
            case 1:
                dayString= "Monday";
                break;
            case 2:
                dayString= "Tuesday";
                break;
            case 3:
                dayString= "Wednesday";
                break;
            case 4:
                dayString= "Thursday";
                break;
            case 5:
                dayString= "Friday";
                break;
            case 6:
                dayString= "Saturday";
                break;
            case 7:
                dayString= "Sunday";
                break;
            default:
                dayString = "Invalid day.";
        }

        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "It's weekday.";
                break;
            case 6:
            case 7:
                dayType = "It's weekend.";
                break;
            default:
                dayType = "Invalid Week type.";


        }
        if (dayString != ""){
            System.out.println("It's " + dayString + " and " + dayType );
        }


    }
}
