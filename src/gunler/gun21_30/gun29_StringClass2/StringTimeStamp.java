package gunler.gun21_30.gun29_StringClass2;

public class StringTimeStamp {
    public static String timeStamp(String strDate) {
        strDate = strDate.replace("/", "");
        strDate = strDate.replace(" ", "");
        strDate = strDate.replace(":", "");

        return strDate;
    }

    public static String timeStamp(String strDate, String special) {
        for (int i = 0; i < special.length(); i++) {
            strDate = strDate.replace((special.charAt(i) + ""), "");
        }
        return strDate;
    }

    public static void main(String[] args) {
        String date = "30/12/20*21 17:35:0?0"; // output = 30122021123500
        System.out.println("timeStamp(date) = " + timeStamp(date));
        System.out.println("timeStamp(date, \"/: ?*+-/\") = " + timeStamp(date, "/: ?*+-/"));
    }
}
