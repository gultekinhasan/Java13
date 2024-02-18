package exercises.gun29;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("what is the farthest planet in the solar system:");
            System.out.println("a)venus");
            System.out.println("b)pluto");
            System.out.println("c)neptune");
            String cevap = sc.nextLine();
            if (cevap.equals("b")){
                System.out.println(cevap + " is correct");
                break;
            } else System.out.println(cevap + " is wrong");
        }while(true);
    }
}
