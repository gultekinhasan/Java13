package exercises.gun29;
import java.util.Scanner;
public class soru2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("what is the farthest planet in the solar system: ");
            System.out.println("a)venus");
            System.out.println("b)pluto");
            System.out.println("c)neptune");
            System.out.println("inputs an answer (a, b or c)");
            String index = sc.nextLine();
            if (index.equals("a")) {
                System.out.println("answer is wrong");
            } else if (index.equals("b")) {
                System.out.println("answer is correct");
            } else if (index.equals("c")) {
                System.out.println("answer is wrong");
            } else {
                System.out.println(index + " is not a valid answer");
            }
        }
        while (true) ;
    }
}
