package gunler.gun21_30.gun30_Review;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Birthday {

    public static void main(String[] args) throws ParseException {

        // Dogum gununuzu tespit eden bir program yaziniz
        // (YYYY-MM-DD)
        // SimpleDateFormat("EEEE")

        System.out.println("Lutfen dogum gununuzu (YYYY-MM-DD) formatta giriniz!");
        Scanner sc = new Scanner(System.in);
        String dateStr = sc.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dateFormat.parse(dateStr);
        String dayOfWeek = getDayofWeek(date);

        System.out.println("Your birthday " + dateStr + " is on " + dayOfWeek);
    }

    public static String getDayofWeek(Date date){
        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
        return dayFormat.format(date);
    }
}
