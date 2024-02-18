package exercises.gun36;

import java.util.ArrayList;
import java.util.Arrays;

public class replit_ReverseSecondWord {
    public static void main(String[] args) {
        ArrayList str = new ArrayList<String>();
        str.add("i love java programming");
        System.out.println(str);
        System.out.println(sortStr(String.valueOf(str)));

    }

    public static String sortStr(String str) {
        String result = "";
        String[] arr = str.split(" ");
        for (String eleman : arr) {
            char[] chars = eleman.toCharArray();
            Arrays.sort(chars);
            result += new String(chars);
        }
        return result;

    }
}