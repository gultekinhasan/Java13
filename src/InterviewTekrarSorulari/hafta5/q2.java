package InterviewTekrarSorulari.hafta5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class q2 {
    /*
    Verilen liste icerisindeki en kucuk degere sahip olan elementi tespit edip,
 ilk siraya tasiyan bir method yaziniz
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(4);
        list.add(7);
        list.add(5);
        list.add(6);
        System.out.println(list);
        int min=0;
        for (int i = 0; i < list.size(); i++) {
            min=list.get(0);
            if (list.get(i)<min){
                min= list.get(i);
            }
        }
        System.out.println(min);
        int temp = list.remove(min);
        list.add(0,temp);
        System.out.println(list);
    }
}
