package gunler.gun51_62.gun57_Collections_List.List;
import java.util.*;

public class ListExampleLinkedList {
    public static void main(String[] args) {
        List<String> colors = new LinkedList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");
        colors.add("Green");
        colors.add("Green");

        System.out.println("List : " + colors);

        colors.add(6, "Purple");
        System.out.println("List : " + colors);

        //Indexed for...loop
        System.out.println("Traversing-Indexed for...loop");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Element index : " + i + "-" + colors.get(i));
        }
        System.out.println();

        //Advanced for...loop
        System.out.println("Traversing-Advanced for...loop");
        for (String eleman : colors) {
            System.out.println(eleman);
        }
        System.out.println();

        //Internal foreach
        //Lambda--> anonymous function
        System.out.println("Traversing-Internal foreach with lambda expression");
        colors.forEach((eleman) -> System.out.println(eleman));
        System.out.println();

        System.out.println("Traversing-Internal foreach with lambda expression");
        colors.forEach((eleman) -> {
            eleman = eleman.toUpperCase();
            System.out.println(eleman);
        });
        System.out.println();

        //Method referance
        System.out.println("Traversing-Internal foreach with method referance");
        colors.forEach(System.out::println);
        System.out.println();

        //Traversing with Iterator
        Iterator<String> itr = colors.iterator();
     /*   System.out.println(itr.hasNext());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());

        System.out.println(itr.hasNext());*/

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println();

        //ConcurrentModificationException error
       /* for (String eleman: colors){
         if(eleman.equals("White")) {
             colors.remove(eleman);
         }
        }*/
        System.out.println();
        System.out.println(colors);
        itr = colors.iterator();
        while (itr.hasNext()){
            if(itr.next().equals("White")){
                itr.remove();
            }
        }
        System.out.println(colors);
    }
}
