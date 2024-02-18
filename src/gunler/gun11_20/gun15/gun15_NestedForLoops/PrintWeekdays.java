package gunler.gun11_20.gun15.gun15_NestedForLoops;

public class PrintWeekdays {
    public static void main(String[] args) {
        System.out.println("Printing weekdays in a week");

        for (int day=1;day<=7;day++){

            if (day == 6 || day==7){
                continue;
            }
            System.out.println("day = " + day);
        }

    }
}
