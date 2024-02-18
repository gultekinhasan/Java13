package gunler.gun21_30.gun27_Random_Math_DateClasses;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateExercise {
    public static void main(String[] args) {
        Date date =new Date();

        long time = date.getTime();
        System.out.println("time = " + time);

        System.out.println("date = " + date);
        System.out.println("time = " + time);

        LocalDate myObj = LocalDate.now();
        System.out.println("myObj = " + myObj);

        LocalTime myObj2 = LocalTime.now();
        System.out.println("myObj2 = " + myObj2);

        LocalDateTime myObj3 = LocalDateTime.now();
        System.out.println("myObj3 = " + myObj3);

        System.out.println(myObj.getYear());
        System.out.println("myObj = " + myObj.getDayOfMonth());
    }
}
