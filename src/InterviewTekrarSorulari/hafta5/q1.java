package InterviewTekrarSorulari.hafta5;

import java.util.ArrayList;
import java.util.List;

public class q1 {
    /*
    Bir listedeki (ArrayList gibi) sayısal değerlerin toplamını hesaplayan ve sonucu bir wrapper sınıf olan
 Integer tipinde döndüren bir Java programı yazın.
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(6);
        list.add(4);
        list.add(5);
        list.add(77);
        int toplam=0;
        for (int i = 0; i < list.size(); i++) {
            toplam+= list.get(i);
        }
        System.out.println("toplam = " + toplam);
    }
}