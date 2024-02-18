package gunler.gun31_40.gun39_Review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DuplicateString {
    public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>(Arrays.asList("ahmet","hasan","hasan","selim","bugra","bugra","hasan","selim"));
    remove(list);
    }

    public static void remove(ArrayList<String> str){

        ArrayList<String> result = new ArrayList<>();
        Collections.sort(str);
        for (int i = 0; i < str.size(); i++) {
            if(!result.contains(str.get(i))){
                result.add(str.get(i));
            }
        }
        System.out.println(result.toString());
    }

}
