package gunler.gun51_62.gun57_Collections_List.List;

import java.util.LinkedList;
import java.util.List;

public class List_ArrayListLinkedList {
    public static void main(String[] args) {
        List<String> liste = new LinkedList<>();
        liste.add("Mavi");
        liste.add("Sari");
        liste.add("Siyah");

        for (String eleman : liste) {
            System.out.println("eleman = " + eleman);
        }

        //Casting
        if (liste instanceof LinkedList<String>) {
            ((LinkedList<String>) liste).addFirst("K覺rm覺z覺");
        }

        //Without casting PATTERN MATCHING
        if (liste instanceof LinkedList<String> renk) {
            renk.addLast("Turuncu");
        }

        System.out.println("liste = " + liste);
    }
}
